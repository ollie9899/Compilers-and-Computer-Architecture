import java.util.HashMap;
import java.util.Map;

public class CodeGenerator extends Task3GramBaseVisitor<String> {

    private Map<String, String> local_vars = new HashMap<>();
    int ifCounter = 0;
    int whileCounter = 0;
    int repeatCounter = 0;

    @Override
    public String visitProg(Task3GramParser.ProgContext ctx) {
        StringBuilder strProg = new StringBuilder();
        //append all macros first
        strProg.append(getMacros());
        //iterate through all decs and append to string
        for (int i = 0; i < ctx.decs.size(); i++) {
                strProg.append(visit(ctx.dec(i)));
            }
        //at the end of all code have an end label that loads top of stack to a0
       return strProg.toString() + "\nend : lw a0, 4(sp)";
    }

    @Override
    public String visitDec(Task3GramParser.DecContext ctx){

        StringBuilder decStr = new StringBuilder();
        //clear local vars each time
        local_vars.clear();
        //put label on top of each function
        decStr.append(ctx.identifier().Idfr().getText() + ":\n");
        //main method has a frame pointer that is used as a "base" that the last activation record's control link can point to
        if(ctx.identifier().Idfr().getText().equals("main")){
            decStr.append("mv fp, sp\n");
            decStr.append("sw fp, 0(sp)\n");
            decStr.append("addi sp, sp, -4\n");
            decStr.append(visit(ctx.block()));
            //at the end of main jump to end
            decStr.append("j end\n");
        } else {
            //change all variables with the an offset from the frame pointer
            int tempInt = -4;
            for (int i = 0; i < ctx.params.size(); i++) {
                String offSet = String.valueOf(tempInt);
                local_vars.put(ctx.params.get(i).identifier().Idfr().getText(), offSet);
                tempInt = tempInt - 4;
            }
            //store return address
            decStr.append("sw ra, 0(sp)\n");
            decStr.append("addi sp, sp, -4\n");
            decStr.append(visit(ctx.block()));
            //restore return address relative to frame pointer
            decStr.append("lw ra, " + ((ctx.params.size()*-4)-8) + "(fp)\n");
            //move the frame pointer up, this is stored in the control link and is accessed relative to the frame pointer
            decStr.append("lw fp, " + ((ctx.params.size()*-4)-4) + "(fp)\n");
            //store the functions return value in t0 before wiping
            decStr.append("lw t0, 4(sp)\n");
            decStr.append("addi, sp, sp, 4\n");
            int sizeAR = ((3+ctx.params.size()))*4;
            //"wipe" the activation record by moving the stack pointer and store the value held in t0 there
            decStr.append("addi sp, sp, " + sizeAR + "\n");
            decStr.append("sw t0, 0(sp)\n");
            decStr.append("addi sp, sp, -4\n");
            //jump to return address
            decStr.append("ret\n");
        }
        return decStr.toString();
    }

    @Override
    public String visitBlock(Task3GramParser.BlockContext ctx){
        StringBuilder blckString = new StringBuilder();

        //if the block is not empty visit each expression and append to string
        if (ctx.exprs.size() != 0) {
            for (int i = 0; i < ctx.exprs.size() ; i++) {
                blckString.append(visit(ctx.exprs.get(i)));
            }
        }
        return blckString.toString();
    }

    @Override
    public String visitIfExpr(Task3GramParser.IfExprContext ctx){
        //increase if counter, this is used to ensure unique labels
        ifCounter++;
        StringBuilder ifEx = new StringBuilder();
        //visit the condition this will result in either a 0 on top of stack if statement is false or
        //a 1 if the statement was true
        ifEx.append(visit(ctx.expr()) + "\n");
        //loads the 1 or 0 into t0 and jumps to 'then' statement if 1 is in t0 and to 'else' if there is a 0
        ifEx.append("lw	t0, 4(sp)\n");
        ifEx.append("addi sp, sp, 4\n");
        //branch to then if not equal to 0
        ifEx.append("bnez 	t0, then" + ifCounter + "\n");
        ifEx.append("j	else" + ifCounter + "\n");
        ifEx.append("then" + ifCounter + ":\n");
        //then statement
        ifEx.append(visitBlock(ctx.block(0)));
        ifEx.append("j ifend" + ifCounter + "\n");
        ifEx.append("else" + ifCounter + ":\n");
        //else statement
        ifEx.append(visitBlock(ctx.block(1)));
        ifEx.append("j ifend" + ifCounter + "\n");
        ifEx.append("ifend" + ifCounter + ":\n");
        return ifEx.toString();
    }

    @Override
    public String visitBinExpr(Task3GramParser.BinExprContext ctx){
        StringBuilder binString = new StringBuilder();
        String binSym = ctx.binop().getText();
        //append exprs first so they are pushed onto stack
        binString.append(visit(ctx.expr(0)));
        binString.append(visit(ctx.expr(1)));
        //switch statement to get appropriate operation, these are all saved as macros so only the macro
        //name is needed
        if (binSym.equals("Plus")) {
            binSym = "Plus\n";
        } else if (binSym.equals("Minus")) {
            binSym = "Minus\n";
        } else if (binSym.equals("Div")) {
            binSym = "Divide\n";
        } else if (binSym.equals("Times")) {
            binSym = "Times\n";
        } else if (binSym.equals("Eq")) {
            binSym = "Equals\n";
        } else if (binSym.equals("Less")) {
            binSym = "Less\n";
        } else if (binSym.equals("Gtr")) {
            binSym = "Greater\n";
        } else if (binSym.equals("LessEq")) {
            binSym = "LessEq\n";
        } else if (binSym.equals("GtrEq")) {
            binSym = "GtrEq\n";
        } else if (binSym.equals("And")) {
            binSym = "ourAnd\n";
        } else if (binSym.equals("Or")) {
            binSym = "ourOr\n";
        } else {
            binSym = "ourXor\n";
        }
        binString.append(binSym);
        return binString.toString();
    }

    @Override
    public String visitFunInvocExpr(Task3GramParser.FunInvocExprContext ctx) {

        StringBuilder funInString = new StringBuilder();
        //push stack pointer onto stack this will later be made frame pointer
        funInString.append("sw sp, 0(sp)\n");
        funInString.append("addi sp, sp, -4\n");
        //push in arguments
        funInString.append(visitBlock(ctx.block()));
        //store the current frame pointer on stack this is the 'control link'
        funInString.append("sw fp, 0(sp)\n");
        funInString.append("addi sp, sp, -4\n");
        //load the value stored at the start of fun invoc into t0
        funInString.append("lw t0, " + (ctx.block().exprs.size()*4+8) + "(sp)\n");
        //make it the frame pointer
        funInString.append("mv fp, t0\n");
        //jump the function fun invoc called
        funInString.append("jal " + ctx.identifier().Idfr().getText() + "\n");
        return funInString.toString();
    }

    @Override
    public String visitAsgmtExpr(Task3GramParser.AsgmtExprContext ctx) {
        StringBuilder asgmtStr = new StringBuilder();
        //get the new value and push onto stack
        asgmtStr.append(visit(ctx.expr()));
        asgmtStr.append("lw t0, 4(sp)\n");
        asgmtStr.append("addi sp, sp, 4\n");
        //hop into stack using offset from the hashmap and change value
        asgmtStr.append("sw t0, " + local_vars.get(ctx.identifier().Idfr().getText()) + "(fp)\n");
        return asgmtStr.toString();
    }


    @Override
    public String visitWhileExpr(Task3GramParser.WhileExprContext ctx){
        //while counter to get unique labels
        whileCounter++;
        StringBuilder whileStr = new StringBuilder();
        //label to be able to jump to start of while statement
        whileStr.append("whileStart" + whileCounter + ":\n");
        //while statement so put condition first
        whileStr.append(visit(ctx.expr()) + "\n");
        //using value pushed onto stack test if condition passed or failed
        whileStr.append("lw t0, 4(sp)\n");
        whileStr.append("addi sp, sp, 4\n");
        //jump out of while if condition failed (0 on top of stack)
        whileStr.append("beqz t0, endWhile" + whileCounter + "\n");
        //do body of while loop
        whileStr.append(visit(ctx.block()) + "\n");
        //jump back to start of while loop
        whileStr.append("j whileStart" + whileCounter + "\n");
        whileStr.append("endWhile" + whileCounter + ":\n");
        return whileStr.toString();
    }

    @Override
    public String visitRepeatExpr(Task3GramParser.RepeatExprContext ctx){
        StringBuilder rptStr = new StringBuilder();
        //repeat counter to prevent duplicate labels
        repeatCounter++;
        rptStr.append("repeatStart" + repeatCounter + ":\n");
        //do the body first because its a repeat loop
        rptStr.append(visit(ctx.block()) + "\n");
        //check condition
        rptStr.append(visit(ctx.expr()) + "\n");
        rptStr.append("lw t0, 4(sp)\n");
        rptStr.append("addi sp, sp, 4\n");
        //jump to end if 0 on top of stack
        rptStr.append("beqz t0, endRepeat" + repeatCounter + "\n");
        //jump to start again
        rptStr.append("j repeatStart" + repeatCounter + "\n");
        rptStr.append("endRepeat" + repeatCounter + ":\n");
        return rptStr.toString();
    }


    @Override
    public String visitIdExpr(Task3GramParser.IdExprContext ctx){
        return visitIdentifier(ctx.identifier());
    }

    @Override
    public String visitIntExpr(Task3GramParser.IntExprContext ctx){
        return visitInteger(ctx.integer());
    }

    @Override
    public String visitBlockExpr(Task3GramParser.BlockExprContext ctx){
        return visitBlock(ctx.block());
    }

    @Override
    public String visitIdentifier(Task3GramParser.IdentifierContext ctx){
        StringBuilder identStr = new StringBuilder();
        //when an identifier is visited use the offset relative to frame pointer to get value from stack
        identStr.append("lw t0, " + local_vars.get(ctx.Idfr().getText()) + "(fp)\n");
        identStr.append("sw t0,(sp)\n");
        identStr.append("addi sp, sp, -4\n");
        return identStr.toString();
    }

    @Override
    public String visitInteger(Task3GramParser.IntegerContext ctx){
        //push integer onto stack
        return "PushImm " + ctx.IntLit().getText() + "\n";
    }

    @Override
    public String visitTyped_idfr(Task3GramParser.Typed_idfrContext ctx){
        //I think this unused but do not want to risk breaking code
        return ctx.identifier().Idfr().getText() + " " + ctx.type().getText() + "\n";
    }

    @Override
    public String visitSkipExpr(Task3GramParser.SkipExprContext ctx) {
        return "";
    }

    public String getMacros() {
        //all macros needed
        String macroStr = (".macro PushImm ($number)\n" +
                "\tli\tt1, $number\n" +
                "\tsw\tt1, (sp)\n" +
                "\taddi\tsp, sp, -4\n" +
                ".end_macro\n" +
                "\n" +
                ".macro Greater\n" +
                "\tlw\tt1, 4(sp)\n" +
                "\taddi\tsp, sp, 4\n" +
                "\tlw\tt2, 4(sp)\n" +
                "\taddi\tsp, sp, 4\t\n" +
                "\tbgt\tt2, t1, trueGtr\n" +
                "\tj\tfalseGtr\n" +
                "trueGtr:\t\n" +
                "\tli \tt0, 1\n" +
                "\tsw\tt0, (sp)\n" +
                "\taddi\tsp, sp, -4\n" +
                "\tj\texitGtr\n" +
                "falseGtr:\n" +
                "\tli\tt0, 0\n" +
                "\tsw\tt0, (sp)\n" +
                "\taddi\tsp, sp, -4\n" +
                "\tj\texitGtr\t\n" +
                "exitGtr:\t\n" +
                ".end_macro\n" +
                "\n" +
                ".macro Equals\n" +
                "\tlw\tt1, 4(sp)\n" +
                "\taddi\tsp, sp, 4\n" +
                "\tlw\tt2, 4(sp)\n" +
                "\taddi\tsp, sp, 4\n" +
                "\tbeq\tt2, t1 trueEq\t\n" +
                "\tj\tfalseEq\n" +
                "trueEq:\t\n" +
                "\tli \tt0, 1\n" +
                "\tsw\tt0, (sp)\n" +
                "\taddi\tsp, sp, -4\n" +
                "\tj\texitEq\n" +
                "falseEq:\n" +
                "\tli\tt0, 0\n" +
                "\tsw\tt0, (sp)\n" +
                "\taddi\tsp, sp, -4\n" +
                "\tj\texitEq\t\n" +
                "exitEq:\t\t\n" +
                ".end_macro\n" +
                "\n" +
                ".macro GtrEq\n" +
                "\tlw\tt1, 4(sp)\n" +
                "\tlw\tt1, 4(sp)\n" +
                "\taddi\tsp, sp, 4\n" +
                "\tlw\tt2, 4(sp)\n" +
                "\taddi\tsp, sp, 4\n" +
                "\tbge\tt2, t1 trueGtrEq\t\n" +
                "\tj\tfalseGtrEq\n" +
                "trueGtrEq:\t\n" +
                "\tli \tt0, 1\n" +
                "\tsw\tt0, (sp)\n" +
                "\taddi\tsp, sp, -4\n" +
                "\tj\texitGtrEq\n" +
                "falseGtrEq:\n" +
                "\tli\tt0, 0\n" +
                "\tsw\tt0, (sp)\n" +
                "\taddi\tsp, sp, -4\n" +
                "\tj\texitGtrEq\t\n" +
                "exitGtrEq:\t\n" +
                ".end_macro\n" +
                "\n" +
                ".macro LessEq\n" +
                "\tlw\tt1, 4(sp)\n" +
                "\taddi\tsp, sp, 4\n" +
                "\tlw\tt2, 4(sp)\n" +
                "\taddi\tsp, sp, 4\n" +
                "\tble\tt2, t1 trueLessEq\t\n" +
                "\tj\tfalseLessEq\n" +
                "trueLessEq:\t\n" +
                "\tli \tt0, 1\n" +
                "\tsw\tt0, (sp)\n" +
                "\taddi\tsp, sp, -4\n" +
                "\tj\texitLessEq\n" +
                "falseLessEq:\n" +
                "\tli\tt0, 0\n" +
                "\tsw\tt0, (sp)\n" +
                "\taddi\tsp, sp, -4\n" +
                "\tj\texitLessEq\n" +
                "exitLessEq:\t\t\n" +
                ".end_macro\n" +
                "\n" +
                ".macro Less\n" +
                "\tlw\tt1, 4(sp)\n" +
                "\taddi\tsp, sp, 4\n" +
                "\tlw\tt2, 4(sp)\n" +
                "\taddi\tsp, sp, 4\n" +
                "\tblt\tt2, t1 trueLess\t\n" +
                "\tj\tfalseLess\n" +
                "trueLess:\t\n" +
                "\tli \tt0, 1\n" +
                "\tsw\tt0, (sp)\n" +
                "\taddi\tsp, sp, -4\n" +
                "\tj\texitLess\n" +
                "falseLess:\n" +
                "\tli\tt0, 0\n" +
                "\tsw\tt0, (sp)\n" +
                "\taddi\tsp, sp, -4\n" +
                "\tj\texitLess\n" +
                "exitLess:\t\t\n" +
                ".end_macro\n" +
                "\n" +
                ".macro\tPlus\n" +
                "\tlw\tt1, 4(sp)\n" +
                "\taddi\tsp, sp, 4\n" +
                "\tlw\tt2, 4(sp)\n" +
                "\taddi\tsp, sp, 4\t\t\n" +
                "\tadd\tt2, t2, t1\n" +
                "\tsw\tt2, (sp)\n" +
                "\taddi\tsp, sp, -4\n" +
                ".end_macro\n" +
                "\n" +
                ".macro\tMinus\n" +
                "\tlw\tt1, 4(sp)\n" +
                "\taddi\tsp, sp, 4\n" +
                "\tlw\tt2, 4(sp)\n" +
                "\taddi\tsp, sp, 4\t\t\n" +
                "\tsub\tt2, t2, t1\n" +
                "\tsw\tt2, (sp)\n" +
                "\taddi\tsp, sp, -4\n" +
                ".end_macro\n" +
                "\n" +
                ".macro Times\n" +
                "\tlw\tt1, 4(sp)\n" +
                "\taddi\tsp, sp, 4\n" +
                "\tlw\tt2, 4(sp)\n" +
                "\taddi\tsp, sp, 4\t\t\n" +
                "\tmul \tt2, t2, t1\n" +
                "\tsw\tt2, (sp)\n" +
                "\taddi\tsp, sp, -4\t\n" +
                ".end_macro\n" +
                "\n" +
                ".macro Divide\n" +
                "\tlw\tt1, 4(sp)\n" +
                "\taddi\tsp, sp, 4\n" +
                "\tlw\tt2, 4(sp)\n" +
                "\taddi\tsp, sp, 4\t\t\n" +
                "\tdiv\tt2, t2, t1\n" +
                "\tsw\tt2, (sp)\n" +
                "\taddi\tsp, sp, -4\n" +
                ".end_macro\n" +
                "\n" +
                ".macro ourAnd\n" +
                "\tlw\tt1, 4(sp)\n" +
                "\taddi\tsp, sp, 4\n" +
                "\tlw\tt2, 4(sp)\n" +
                "\taddi\tsp, sp, 4\n" +
                "\tli\tt0, 16\n" +
                "\tadd\tfp, fp, t0\t\n" +
                "\tbeqz\tt1, falseAnd\n" +
                "\tbeqz\tt2, falseAnd\n" +
                "\tj\ttrueAnd\n" +
                "trueAnd:\t\n" +
                "\tli \tt0, 1\n" +
                "\tsw\tt0, (sp)\n" +
                "\taddi\tsp, sp, -4\n" +
                "\tj\texitAnd\n" +
                "falseAnd:\n" +
                "\tli\tt0, 0\n" +
                "\tsw\tt0, (sp)\n" +
                "\taddi\tsp, sp, -4\n" +
                "\tj\texitAnd\t\n" +
                "exitAnd:\n" +
                ".end_macro\n" +
                "\n" +
                ".macro ourOr\n" +
                "\tlw\tt1, 4(sp)\n" +
                "\taddi\tsp, sp, 4\n" +
                "\tlw\tt2, 4(sp)\n" +
                "\taddi\tsp, sp, 4\n" +
                "\tli\tt0, 16\n" +
                "\tadd\tfp, fp, t0\t\t\n" +
                "\tbnez\tt1, trueOur\n" +
                "\tbnez\tt2, trueOur\n" +
                "\tj\tfalseOur\n" +
                "trueOur:\t\n" +
                "\tli \tt0, 1\n" +
                "\tsw\tt0, (sp)\n" +
                "\taddi\tsp, sp, -4\n" +
                "\tj\texitOur\n" +
                "falseOur:\n" +
                "\tli\tt0, 0\n" +
                "\tsw\tt0, (sp)\n" +
                "\taddi\tsp, sp, -4\n" +
                "\tj\texitOur\t\n" +
                "exitOur:\t\t\n" +
                ".end_macro\n" +
                "\n" +
                ".macro ourXor\n" +
                "\tlw\tt1, 4(sp)\n" +
                "\taddi\tsp, sp, 4\n" +
                "\tlw\tt2, 4(sp)\n" +
                "\taddi\tsp, sp, 4\n" +
                "\tli\tt0, 28\n" +
                "\tadd\tfp, fp, t0\t\t\n" +
                "\tbnez\tt1, firstTrueXor\n" +
                "\tj \tfirstFalseXor\n" +
                "firstTrueXor: \n" +
                "\tbnez\tt2, falseXor\n" +
                "\tj \ttrueXor\n" +
                "firstFalseXor: \n" +
                "\tbnez \tt2, trueXor\n" +
                "\tj \tfalseXor\n" +
                "trueXor:\t\n" +
                "\tli \tt0, 1\n" +
                "\tsw\tt0, (sp)\n" +
                "\taddi\tsp, sp, -4\n" +
                "\tj\texitXor\n" +
                "falseXor:\n" +
                "\tli\tt0, 0\n" +
                "\tsw\tt0, (sp)\n" +
                "\taddi\tsp, sp, -4\n" +
                "\tj\texitXor\n" +
                "exitXor:\t\t \t\t \t\n" +
                ".end_macro\n" +
                "\n" +
                ".text\n" +
                "\n");
        return macroStr;
    }

}

