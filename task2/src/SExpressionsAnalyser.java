import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class SExpressionsAnalyser extends SExpressionsBaseVisitor<Types>
{

    private Map<String, SExpressionsParser.DecContext> global_funcs = new HashMap<>();
    private Map<String, Types> local_vars = new HashMap<>();

    private SExpressionsParser.DecContext current_dec = null;
    private final SExpressionsToString toStrConverter = new SExpressionsToString();

    public String visitAndPrint(SExpressionsParser.ProgContext prog)
    {

        visit(prog);    // Discards the dummy return value.

        // At this point, we know for sure that there is at least a 'main' function.

        int index_main = 0;
        for (int i = 0; i < prog.decs.size(); ++i) {
            SExpressionsParser.DecContext dec = prog.decs.get(i);
            if (dec.identifier().Idfr().getText().equals("main")) {
                index_main = i;
            }
        }

        SExpressionsParser.DecContext main = prog.decs.get(index_main);
        prog.decs.set(index_main, prog.decs.get(0));
        prog.decs.set(0, main);

        return toStrConverter.visitHighlight(prog, prog).replaceAll("\u001B\\[[;\\d]*m", "");   // Removes ANSI colours.

    }

    @Override public Types visitProg(SExpressionsParser.ProgContext ctx) {

        Boolean found_main = false;

        //iterate through all dec that exist in prog
        for (int i = 0; i < ctx.decs.size(); i++) {


            SExpressionsParser.DecContext dec = ctx.decs.get(i);
            SExpressionsParser.IdentifierContext id = dec.identifier();
            SExpressionsParser.TypeContext type = dec.type();


            //check if the identifier in the declaration is main
            if (id.Idfr().getText().equals("main")) {
                found_main = true;

                //if a main function is found check it has no parameters
                if (dec.params.size() != 0) {
                    throw new TypeException().mainFuncError(dec, dec.params.get(0), Types.toType(dec.params.get(0).type()));
                //if no parameters are found then check it returns type int
                } else if (!type.getText().equals("IntType")) {
                    throw new TypeException().mainFuncError(ctx, dec, Types.toType(dec.type()));
                }
            }
            //if the function already exists throw error else add to table of functions
            if (global_funcs.containsKey(id.getText())) {
                throw new TypeException().duplicatedFuncError(ctx, id, Types.toType(type));
            } else {
                global_funcs.put(id.getText(), dec);
            }

        }
        //if no main function found throw error
        if (!found_main) {
            throw new TypeException().noMainFuncError();
        }
        //visit each dec one by one now they all exist in global funcs
        for (int i = 0; i < ctx.decs.size(); i++) {
            SExpressionsParser.DecContext dec = ctx.decs.get(i);
            visit(dec);
        }

        return Types.UNKNOWN;  // This is just a dummy return value.

    }

    @Override public Types visitDec(SExpressionsParser.DecContext ctx)
    {
        //everytime a new function is visited clear the local variable table and set current dec
        local_vars.clear();
        current_dec = ctx;
        if (ctx.params.size() != 0) {
            //iterate through all the parameters in the function
            for (int i=0; i < ctx.params.size(); i++) {
                SExpressionsParser.Typed_idfrContext idfr_ctx = ctx.params.get(i);
                SExpressionsParser.IdentifierContext id_ctx = idfr_ctx.identifier();
                SExpressionsParser.TypeContext type = idfr_ctx.type();
                //check for duplicate names
                if (local_vars.containsKey(id_ctx.getText())){
                    throw new TypeException().duplicatedVarError(ctx, id_ctx, Types.toType(type));
                //check a parameter is not UnitType
                } else if (type.getText().equals("UnitType")){
                        throw new TypeException().unitVarError(ctx, id_ctx, Types.toType(type));
                } else {
                    //add parameter to local vars
                    local_vars.put(id_ctx.getText(), Types.toType(type));
                }
            }
        }

        ctx.block().t = visit(ctx.block());
        //check the return type of the block is the same as the function return type
        if (ctx.block().t != Types.toType(current_dec.type())) {
            throw new TypeException().functionBodyError(current_dec, ctx.block().expr(ctx.block().exprs.size()-1), ctx.block().t);
        }
        visit(ctx.block());
        
        return Types.toType(current_dec.type());
    }

    @Override public Types visitTyped_idfr(SExpressionsParser.Typed_idfrContext ctx)
    {
        throw new RuntimeException("Should not be here!");
    }

    @Override public Types visitType(SExpressionsParser.TypeContext ctx)
    {
        throw new RuntimeException("Should not be here!");
    }

    @Override public Types visitBlock(SExpressionsParser.BlockContext ctx)
    {

        int j = 0;
        //iterate through all expressions in block
        if (ctx.exprs.size() != 0) {
            for (int i = 0; i < ctx.exprs.size(); ++i) {
                //visit each expression as you go
                visit(ctx.expr(j));
                j = i;
            }
            //set the type of block to the type of the last expression in block
            ctx.t = visit(ctx.expr(j));
            return ctx.t;
        // if no expressions in block just return the type of the function declaration
        } else { return Types.toType(current_dec.type()); }
    }

    @Override public Types visitIfExpr(SExpressionsParser.IfExprContext ctx)
    {
        //get the types of expr, block(0) and block(1)
        SExpressionsParser.ExprContext ifCondition = ctx.expr();
        ifCondition.t = visit(ifCondition);

        //check expr is type BOOL
        if (ifCondition.t != Types.BOOL){
            throw new TypeException().conditionError(ctx, ifCondition, ifCondition.t);
        //check the 2 blocks have the same return type
        } else if ( visit(ctx.block(0)) != visit(ctx.block(1))) {
            throw new TypeException().branchMismatchError(ctx, ctx.block(0).expr(ctx.block(0).exprs.size()-1), visit(ctx.block(0)), ctx.block(1).expr(ctx.block(1).exprs.size()-1), visit(ctx.block(1)));

        } else { return visit(ctx.block(0));}
    }

    @Override public Types visitBinExpr(SExpressionsParser.BinExprContext ctx)
    {
        //get the types of the two expressions in the binary expression
        SExpressionsParser.ExprContext operand1 = ctx.expr(0);
        operand1.t = visit(operand1);
        SExpressionsParser.ExprContext operand2 = ctx.expr(1);
        operand2.t = visit(operand2);

        //switch statement to determine the type of the boolean expression
        Types t = switch (((TerminalNode) (ctx.binop().getChild(0))).getSymbol().getType()) {
            //if its a comparison check both expr types are INT
            case SExpressionsParser.Eq, SExpressionsParser.Less, SExpressionsParser.Gtr, SExpressionsParser.LessEq, SExpressionsParser.GtrEq -> {

                if (operand1.t != Types.INT || operand2.t != Types.INT) {
                    throw new TypeException().comparisonError(ctx, ctx.expr(0), operand1.t, ctx.expr(1), operand2.t);
                } else {
                    //comparison expression yields type BOOL
                    yield Types.BOOL;
                }
            }
            //if its a numerical expression check both expr types are INT
            case SExpressionsParser.Plus, SExpressionsParser.Minus, SExpressionsParser.Div, SExpressionsParser.Times -> {

                if (operand1.t != Types.INT || operand2.t != Types.INT) {
                    throw new TypeException().arithmeticError(ctx, ctx.expr(0), operand1.t, ctx.expr(1), operand2.t);
                } else {
                    //numerical expression yields type INT
                    yield Types.INT;
                }
            }
            //if its a boolean operation check both expr types are BOOL
            case SExpressionsParser.And, SExpressionsParser.Or, SExpressionsParser.Xor -> {

                if (operand1.t != Types.BOOL || operand2.t != Types.BOOL) {
                    throw new TypeException().logicalError(ctx, ctx.expr(0), operand1.t, ctx.expr(1), operand2.t);
                } else {
                    //boolean operation yields type BOOL
                    yield Types.BOOL;
                }
            }
            //if no valid binop symbols are found throw error
            default -> {
                throw new RuntimeException("Shouldn't be here - wrong binary operator.");
            }

        };
        //return type assigned to t by the switch statement
        return t;
    }

    @Override public Types visitWhileExpr(SExpressionsParser.WhileExprContext ctx)
    {

        //get the type of the while loop condition (expr) and the loop body (block)
        SExpressionsParser.ExprContext whileCondition = ctx.expr();
        whileCondition.t = visit(whileCondition);
        Types whileBody = visit(ctx.block());
        //check while condition is type BOOL
        if (whileCondition.t != Types.BOOL) {
            throw new TypeException().conditionError(ctx, whileCondition, whileCondition.t);
        //check while body is type UNIT
        } else if (whileBody != Types.UNIT) {
            throw new TypeException().loopBodyError(ctx, ctx.block().expr(ctx.block().exprs.size()-1), whileBody);
        } else {
            return whileBody; }
    }

    @Override public Types visitRepeatExpr(SExpressionsParser.RepeatExprContext ctx)
    {
        //get the type of the repeat loop condition (expr) and the loop body (block)
        SExpressionsParser.ExprContext repeatCondition = ctx.expr();
        repeatCondition.t = visit(repeatCondition);
        Types repeatBody = visit(ctx.block());
        //check repeat condition is type BOOL
        if (repeatCondition.t != Types.BOOL) {
            throw new TypeException().conditionError(ctx, repeatCondition, repeatCondition.t);
        //check loop body is type UNIT
        } else if (repeatBody != Types.UNIT) {
            throw new TypeException().loopBodyError(ctx, ctx.block().expr(ctx.block().exprs.size()-1), repeatBody);
        } else { return repeatBody; }

    }

    @Override public Types visitAsgmtExpr(SExpressionsParser.AsgmtExprContext ctx)
    {

        //check variable exists
        if (local_vars.containsKey(ctx.identifier().getText())) {
            //check assigment types are compatible
            ctx.expr().t = visit(ctx.expr());
            if (local_vars.get(ctx.identifier().getText()) != ctx.expr().t) {
                throw new TypeException().assignmentError(ctx, ctx.identifier(), local_vars.get(ctx.identifier().getText()), ctx.expr(), ctx.expr().t);
            }
        } else {
            throw new TypeException().undeclaredVarError(current_dec, ctx.identifier(), Types.UNKNOWN);
        }

        return Types.UNIT;
    }

    @Override public Types visitFunInvocExpr(SExpressionsParser.FunInvocExprContext ctx)
    {

        //check function exists
        if (global_funcs.containsKey(ctx.identifier().getText())) {
            //check amount of parameters in function is equal to amount function is invoked with
            int x = global_funcs.get(ctx.identifier().getText()).params.size();
            int y = ctx.block().exprs.size();
            if (x != y) {
                throw new TypeException().argumentNumberError(ctx, ctx.block(), Types.UNKNOWN);
            } else {
                //check parameter types in functions function match types function is invoked with
                for (int n = 0; n < ctx.block().exprs.size(); n++) {
                    //get the type of each expression in the block and if it returns null it does not exist so an error can be thrown
                    ctx.block().expr(n).t = visit(ctx.block().expr(n));
                    if (ctx.block().expr(n).t == null){
                        throw new TypeException().undeclaredVarError(current_dec, ctx.block().expr(n), Types.UNKNOWN);
                    }
                        if (Types.toType(global_funcs.get(ctx.identifier().getText()).typed_idfr(n).type()) != ctx.block().expr(n).t) {
                        throw new TypeException().argumentError(ctx, ctx.block().expr(n), ctx.block().expr(n).t);
                    }
                }
            }
        } else {
            throw new TypeException().undeclaredFuncError(current_dec, ctx.identifier(), Types.UNKNOWN);
        }
        return Types.toType(global_funcs.get(ctx.identifier().getText()).type());
    }

    @Override public Types visitBlockExpr(SExpressionsParser.BlockExprContext ctx)
    {
        //handled by visitBlock method
         return visit(ctx.block());
    }

    @Override public Types visitIdExpr(SExpressionsParser.IdExprContext ctx) {
        //get type of the identifier
        if (local_vars.containsKey(ctx.identifier().getText())) {
            return local_vars.get(ctx.getText());
        } else {
            throw new TypeException().undeclaredVarError(current_dec, ctx.identifier(), Types.UNKNOWN);
        }


    }

    @Override public Types visitIntExpr(SExpressionsParser.IntExprContext ctx)
    {
        return Types.INT;
    }

    @Override public Types visitSkipExpr(SExpressionsParser.SkipExprContext ctx)
    {
        return Types.UNIT;
    }

    @Override public Types visitIdentifier(SExpressionsParser.IdentifierContext ctx)
    {
        throw new RuntimeException("Should not be here!");
    }

    @Override public Types visitInteger(SExpressionsParser.IntegerContext ctx)
    {
        throw new RuntimeException("Should not be here!");
    }

    @Override public Types visitBinop(SExpressionsParser.BinopContext ctx)
    {
        throw new RuntimeException("Should not be here!");
    }

}
