public class Converter extends CWorkGramBaseVisitor<String> {

    @Override
    public String visitWholeexpr(CWorkGramParser.WholeexprContext ctx) {

        return "[" + visitProg(ctx.prog()) + "]";
    }

    @Override
    public String visitProg(CWorkGramParser.ProgContext ctx) {
        //visit progs until there are no more then visit dec
        if(ctx.prog() != null)
            //if there are
            return visitProg(ctx.prog()) + "," + visitDec(ctx.dec());
        return  visitDec(ctx.dec());
    }


    @Override
    public String visitDec(CWorkGramParser.DecContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append("FunDecl");
        sb.append(",");
        //get the idfr for the function
        sb.append("Idfr(\"" + ctx.Idfr().getText() + "\")");
        sb.append(",");
        //get the return type of the function
        sb.append(visitType(ctx.type()));
        sb.append(",");
        sb.append("[");
        //get the variable declarations (could not be any)
        sb.append(visitVardec(ctx.vardec()));
        sb.append("],");
        //visit the body of the block
        sb.append(visitBlock(ctx.block()));
        sb.append("]");
        return sb.toString();
    }

    @Override
    public String visitVardec(CWorkGramParser.VardecContext ctx) {
        //visit the variable decs if there any, if not return nothing
        if (ctx.vardecne() != null) {
            return visit(ctx.vardecne());
        } else { return ""; }
    }

    @Override
    public String visitVardecneType(CWorkGramParser.VardecneTypeContext ctx) {
        //get the identifiers and then the type so formatted as specified
        return visit(ctx.vardecne()) + ",[Idfr(\"" + ctx.Idfr().getText() + "\")," + visitType(ctx.type()) + "]";
    }



    @Override
    public String visitJustType(CWorkGramParser.JustTypeContext ctx) {
        //return the identifier then the type
        return "[Idfr(\"" + ctx.Idfr().getText() + "\")," + visitType(ctx.type()) + "]";
    }

    //blockExp is the same as block so use visitBlock method
    @Override
    public String visitBlockExp(CWorkGramParser.BlockExpContext ctx) {
        return visitBlock(ctx.block());
    }

    //visit the ene inside the block
    @Override
    public String visitBlock(CWorkGramParser.BlockContext ctx) {
        return "[" + visit(ctx.ene());
    }

    @Override
    public String visitEne(CWorkGramParser.EneContext ctx) {
        //keep calling ene until there are no more to call
        if (ctx.ene() == null) {
            return visit(ctx.exp()) + "]";
        } else {
            return visit(ctx.exp()) + "," + visitEne(ctx.ene());
        }
    }


    @Override
    public String visitRepeatLoop(CWorkGramParser.RepeatLoopContext ctx) {
        StringBuilder sb8 = new StringBuilder();
        sb8.append("[");
        sb8.append("RepeatLoop");
        sb8.append(",");
        //get condition of loop
        sb8.append(visit(ctx.exp()));
        sb8.append(",");
        //get body of loop
        sb8.append(visit(ctx.block()));
        sb8.append("]");
        return sb8.toString();
    }

    @Override
    public String visitWhileLoop(CWorkGramParser.WhileLoopContext ctx) {
        StringBuilder sb7 = new StringBuilder();
        sb7.append("[");
        sb7.append("WhileLoop");
        sb7.append(",");
        //get condition of loop
        sb7.append(visit(ctx.exp()));
        sb7.append(",");
        //get body of the loop
        sb7.append(visit(ctx.block()));
        sb7.append("]");
        return sb7.toString();
    }

    @Override
    public String visitIfStmt(CWorkGramParser.IfStmtContext ctx) {
        StringBuilder sb6 = new StringBuilder();
        sb6.append("[");
        sb6.append("IfStmt");
        sb6.append(",");
        //get if statement condition
        sb6.append(visit(ctx.exp()));
        sb6.append(",");
        //get then statement of if
        sb6.append(visit(ctx.block(0)));
        sb6.append(",");
        //get else statement of if
        sb6.append(visit(ctx.block(1)));
        sb6.append("]");
        return sb6.toString();
    }

    @Override
    public String visitBinOpExpr(CWorkGramParser.BinOpExprContext ctx) {
        //return binOp expression with the operator first as in the specification
        return "[BinOpExpr," + visitBinop(ctx.binop()) + "," + visit(ctx.exp(0)) + "," + visit(ctx.exp(1)) + "]";
    }

    @Override
    public String visitAsgmt(CWorkGramParser.AsgmtContext ctx) {
        StringBuilder sb4 = new StringBuilder();
        sb4.append("[");
        sb4.append("Asgmt");
        sb4.append(",");
        //get identifier of assignment
        sb4.append("Idfr(\"" + ctx.Idfr().getText() + "\")");
        sb4.append(",");
        //get what you are assigning it as
        sb4.append(visit(ctx.exp()));
        sb4.append("]");
        return sb4.toString();
    }

    @Override
    public String visitFunInvoc(CWorkGramParser.FunInvocContext ctx) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("[");
        sb3.append("FunInvoc,");
        //get the name of the function being invoked
        sb3.append("Idfr(\"" + ctx.Idfr().getText() + "\")");
        sb3.append(",");
        sb3.append("[");
        //get the arguments being given
        sb3.append(visitArgs(ctx.args()));
        sb3.append("]");
        sb3.append("]");
        return sb3.toString();
    }

    //get text in idfr
    @Override
    public String visitIdfrExp(CWorkGramParser.IdfrExpContext ctx) {
        return "Idfr(\"" + ctx.Idfr().getText() + "\")";
    }

    //skip returns skip
    @Override
    public String visitSkipExp(CWorkGramParser.SkipExpContext ctx) {
        return "Skip";
    }

    //get the integer
    @Override
    public String visitIntLitExp(CWorkGramParser.IntLitExpContext ctx) {
        return "IntLit(" + ctx.IntLit().getText() + ")";
    }

    @Override
    public String visitArgs(CWorkGramParser.ArgsContext ctx) {
        //check if there is an argsne in args if there is visit it
        if (ctx.argsne() != null) {
            return visit(ctx.argsne());
        } else { return ""; }
    }

    //visit argsne then visit the expression, program decides which version of argsne to call
    @Override
    public String visitArgsneExp(CWorkGramParser.ArgsneExpContext ctx) {

        return visit(ctx.argsne())+ "," + visit(ctx.exp());
    }

    @Override
    public String visitJustExp(CWorkGramParser.JustExpContext ctx) {
        return visit(ctx.exp());
    }

    //check what type is then return correct
    @Override
    public String visitType(CWorkGramParser.TypeContext ctx) {
        if (ctx.getText().equals("int")) {
            return "IntType";
        } else if (ctx.getText().equals("bool")) {
            return "BoolType";
        } else return "UnitType";
    }

    //print out correct binary operation
    @Override
    public String visitBinop(CWorkGramParser.BinopContext ctx) {

        if (ctx.getText().equals("^^")) {
            return "Xor";
        } else if (ctx.getText().equals("<")) {
            return "Less";
        } else if (ctx.getText().equals(">")) {
            return "Gtr";
        } else if (ctx.getText().equals("<=")) {
            return "LessEq";
        } else if (ctx.getText().equals(">=")) {
            return "GtrEq";
        } else if (ctx.getText().equals("+")) {
            return "Plus";
        } else if (ctx.getText().equals("-")) {
            return "Minus";
        } else if (ctx.getText().equals("*")) {
            return "Times";
        } else if (ctx.getText().equals("/")) {
            return "Div";
        } else if (ctx.getText().equals("&&")) {
            return "And";
        } else if (ctx.getText().equals("||")) {
            return "Or";
        } else return "Eq";
    }
}