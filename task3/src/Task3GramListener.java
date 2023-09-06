// Generated from C:/Users/ofp20/OneDrive - University of Sussex/Compiler and Computer Architecture/CWorkTask3/src\Task3Gram.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Task3GramParser}.
 */
public interface Task3GramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Task3GramParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(Task3GramParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task3GramParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(Task3GramParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task3GramParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(Task3GramParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task3GramParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(Task3GramParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task3GramParser#typed_idfr}.
	 * @param ctx the parse tree
	 */
	void enterTyped_idfr(Task3GramParser.Typed_idfrContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task3GramParser#typed_idfr}.
	 * @param ctx the parse tree
	 */
	void exitTyped_idfr(Task3GramParser.Typed_idfrContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task3GramParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(Task3GramParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task3GramParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(Task3GramParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task3GramParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Task3GramParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task3GramParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Task3GramParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfExpr}
	 * labeled alternative in {@link Task3GramParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(Task3GramParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfExpr}
	 * labeled alternative in {@link Task3GramParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(Task3GramParser.IfExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinExpr}
	 * labeled alternative in {@link Task3GramParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinExpr(Task3GramParser.BinExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinExpr}
	 * labeled alternative in {@link Task3GramParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinExpr(Task3GramParser.BinExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileExpr}
	 * labeled alternative in {@link Task3GramParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterWhileExpr(Task3GramParser.WhileExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileExpr}
	 * labeled alternative in {@link Task3GramParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitWhileExpr(Task3GramParser.WhileExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RepeatExpr}
	 * labeled alternative in {@link Task3GramParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRepeatExpr(Task3GramParser.RepeatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RepeatExpr}
	 * labeled alternative in {@link Task3GramParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRepeatExpr(Task3GramParser.RepeatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AsgmtExpr}
	 * labeled alternative in {@link Task3GramParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAsgmtExpr(Task3GramParser.AsgmtExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AsgmtExpr}
	 * labeled alternative in {@link Task3GramParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAsgmtExpr(Task3GramParser.AsgmtExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunInvocExpr}
	 * labeled alternative in {@link Task3GramParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunInvocExpr(Task3GramParser.FunInvocExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunInvocExpr}
	 * labeled alternative in {@link Task3GramParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunInvocExpr(Task3GramParser.FunInvocExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockExpr}
	 * labeled alternative in {@link Task3GramParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBlockExpr(Task3GramParser.BlockExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockExpr}
	 * labeled alternative in {@link Task3GramParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBlockExpr(Task3GramParser.BlockExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link Task3GramParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(Task3GramParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link Task3GramParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(Task3GramParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link Task3GramParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntExpr(Task3GramParser.IntExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link Task3GramParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntExpr(Task3GramParser.IntExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SkipExpr}
	 * labeled alternative in {@link Task3GramParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSkipExpr(Task3GramParser.SkipExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SkipExpr}
	 * labeled alternative in {@link Task3GramParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSkipExpr(Task3GramParser.SkipExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task3GramParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(Task3GramParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task3GramParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(Task3GramParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task3GramParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(Task3GramParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task3GramParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(Task3GramParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task3GramParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterBinop(Task3GramParser.BinopContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task3GramParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitBinop(Task3GramParser.BinopContext ctx);
}