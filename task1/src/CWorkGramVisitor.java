// Generated from C:/Users/ofp20/OneDrive - University of Sussex/Compiler and Computer Architecture/CWorkTask1/src\CWorkGram.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CWorkGramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CWorkGramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CWorkGramParser#wholeexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWholeexpr(CWorkGramParser.WholeexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWorkGramParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CWorkGramParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWorkGramParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec(CWorkGramParser.DecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWorkGramParser#vardec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardec(CWorkGramParser.VardecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vardecneType}
	 * labeled alternative in {@link CWorkGramParser#vardecne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecneType(CWorkGramParser.VardecneTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code justType}
	 * labeled alternative in {@link CWorkGramParser#vardecne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJustType(CWorkGramParser.JustTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWorkGramParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CWorkGramParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWorkGramParser#ene}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEne(CWorkGramParser.EneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idfrExp}
	 * labeled alternative in {@link CWorkGramParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdfrExp(CWorkGramParser.IdfrExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intLitExp}
	 * labeled alternative in {@link CWorkGramParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLitExp(CWorkGramParser.IntLitExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asgmt}
	 * labeled alternative in {@link CWorkGramParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsgmt(CWorkGramParser.AsgmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOpExpr}
	 * labeled alternative in {@link CWorkGramParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpExpr(CWorkGramParser.BinOpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funInvoc}
	 * labeled alternative in {@link CWorkGramParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunInvoc(CWorkGramParser.FunInvocContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockExp}
	 * labeled alternative in {@link CWorkGramParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockExp(CWorkGramParser.BlockExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link CWorkGramParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(CWorkGramParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileLoop}
	 * labeled alternative in {@link CWorkGramParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(CWorkGramParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repeatLoop}
	 * labeled alternative in {@link CWorkGramParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatLoop(CWorkGramParser.RepeatLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code skipExp}
	 * labeled alternative in {@link CWorkGramParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipExp(CWorkGramParser.SkipExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWorkGramParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(CWorkGramParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code justExp}
	 * labeled alternative in {@link CWorkGramParser#argsne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJustExp(CWorkGramParser.JustExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argsneExp}
	 * labeled alternative in {@link CWorkGramParser#argsne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgsneExp(CWorkGramParser.ArgsneExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWorkGramParser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinop(CWorkGramParser.BinopContext ctx);
	/**
	 * Visit a parse tree produced by {@link CWorkGramParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CWorkGramParser.TypeContext ctx);
}