// Generated from C:/Users/ofp20/OneDrive - University of Sussex/Compiler and Computer Architecture/CWorkTask1/src\CWorkGram.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CWorkGramParser}.
 */
public interface CWorkGramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CWorkGramParser#wholeexpr}.
	 * @param ctx the parse tree
	 */
	void enterWholeexpr(CWorkGramParser.WholeexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWorkGramParser#wholeexpr}.
	 * @param ctx the parse tree
	 */
	void exitWholeexpr(CWorkGramParser.WholeexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWorkGramParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CWorkGramParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWorkGramParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CWorkGramParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWorkGramParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(CWorkGramParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWorkGramParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(CWorkGramParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWorkGramParser#vardec}.
	 * @param ctx the parse tree
	 */
	void enterVardec(CWorkGramParser.VardecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWorkGramParser#vardec}.
	 * @param ctx the parse tree
	 */
	void exitVardec(CWorkGramParser.VardecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vardecneType}
	 * labeled alternative in {@link CWorkGramParser#vardecne}.
	 * @param ctx the parse tree
	 */
	void enterVardecneType(CWorkGramParser.VardecneTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vardecneType}
	 * labeled alternative in {@link CWorkGramParser#vardecne}.
	 * @param ctx the parse tree
	 */
	void exitVardecneType(CWorkGramParser.VardecneTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code justType}
	 * labeled alternative in {@link CWorkGramParser#vardecne}.
	 * @param ctx the parse tree
	 */
	void enterJustType(CWorkGramParser.JustTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code justType}
	 * labeled alternative in {@link CWorkGramParser#vardecne}.
	 * @param ctx the parse tree
	 */
	void exitJustType(CWorkGramParser.JustTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWorkGramParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CWorkGramParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWorkGramParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CWorkGramParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWorkGramParser#ene}.
	 * @param ctx the parse tree
	 */
	void enterEne(CWorkGramParser.EneContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWorkGramParser#ene}.
	 * @param ctx the parse tree
	 */
	void exitEne(CWorkGramParser.EneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idfrExp}
	 * labeled alternative in {@link CWorkGramParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIdfrExp(CWorkGramParser.IdfrExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idfrExp}
	 * labeled alternative in {@link CWorkGramParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIdfrExp(CWorkGramParser.IdfrExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intLitExp}
	 * labeled alternative in {@link CWorkGramParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIntLitExp(CWorkGramParser.IntLitExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intLitExp}
	 * labeled alternative in {@link CWorkGramParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIntLitExp(CWorkGramParser.IntLitExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asgmt}
	 * labeled alternative in {@link CWorkGramParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAsgmt(CWorkGramParser.AsgmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asgmt}
	 * labeled alternative in {@link CWorkGramParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAsgmt(CWorkGramParser.AsgmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOpExpr}
	 * labeled alternative in {@link CWorkGramParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBinOpExpr(CWorkGramParser.BinOpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOpExpr}
	 * labeled alternative in {@link CWorkGramParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBinOpExpr(CWorkGramParser.BinOpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funInvoc}
	 * labeled alternative in {@link CWorkGramParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFunInvoc(CWorkGramParser.FunInvocContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funInvoc}
	 * labeled alternative in {@link CWorkGramParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFunInvoc(CWorkGramParser.FunInvocContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockExp}
	 * labeled alternative in {@link CWorkGramParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBlockExp(CWorkGramParser.BlockExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockExp}
	 * labeled alternative in {@link CWorkGramParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBlockExp(CWorkGramParser.BlockExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link CWorkGramParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(CWorkGramParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link CWorkGramParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(CWorkGramParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileLoop}
	 * labeled alternative in {@link CWorkGramParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(CWorkGramParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileLoop}
	 * labeled alternative in {@link CWorkGramParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(CWorkGramParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repeatLoop}
	 * labeled alternative in {@link CWorkGramParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterRepeatLoop(CWorkGramParser.RepeatLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repeatLoop}
	 * labeled alternative in {@link CWorkGramParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitRepeatLoop(CWorkGramParser.RepeatLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code skipExp}
	 * labeled alternative in {@link CWorkGramParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSkipExp(CWorkGramParser.SkipExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code skipExp}
	 * labeled alternative in {@link CWorkGramParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSkipExp(CWorkGramParser.SkipExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWorkGramParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(CWorkGramParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWorkGramParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(CWorkGramParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code justExp}
	 * labeled alternative in {@link CWorkGramParser#argsne}.
	 * @param ctx the parse tree
	 */
	void enterJustExp(CWorkGramParser.JustExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code justExp}
	 * labeled alternative in {@link CWorkGramParser#argsne}.
	 * @param ctx the parse tree
	 */
	void exitJustExp(CWorkGramParser.JustExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argsneExp}
	 * labeled alternative in {@link CWorkGramParser#argsne}.
	 * @param ctx the parse tree
	 */
	void enterArgsneExp(CWorkGramParser.ArgsneExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argsneExp}
	 * labeled alternative in {@link CWorkGramParser#argsne}.
	 * @param ctx the parse tree
	 */
	void exitArgsneExp(CWorkGramParser.ArgsneExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWorkGramParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterBinop(CWorkGramParser.BinopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWorkGramParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitBinop(CWorkGramParser.BinopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CWorkGramParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CWorkGramParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CWorkGramParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CWorkGramParser.TypeContext ctx);
}