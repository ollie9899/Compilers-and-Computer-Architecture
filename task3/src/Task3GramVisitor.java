// Generated from C:/Users/ofp20/OneDrive - University of Sussex/Compiler and Computer Architecture/CWorkTask3/src\Task3Gram.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Task3GramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Task3GramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Task3GramParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(Task3GramParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task3GramParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec(Task3GramParser.DecContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task3GramParser#typed_idfr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyped_idfr(Task3GramParser.Typed_idfrContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task3GramParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(Task3GramParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task3GramParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Task3GramParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfExpr}
	 * labeled alternative in {@link Task3GramParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpr(Task3GramParser.IfExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinExpr}
	 * labeled alternative in {@link Task3GramParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinExpr(Task3GramParser.BinExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileExpr}
	 * labeled alternative in {@link Task3GramParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileExpr(Task3GramParser.WhileExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RepeatExpr}
	 * labeled alternative in {@link Task3GramParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatExpr(Task3GramParser.RepeatExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AsgmtExpr}
	 * labeled alternative in {@link Task3GramParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsgmtExpr(Task3GramParser.AsgmtExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunInvocExpr}
	 * labeled alternative in {@link Task3GramParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunInvocExpr(Task3GramParser.FunInvocExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockExpr}
	 * labeled alternative in {@link Task3GramParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockExpr(Task3GramParser.BlockExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link Task3GramParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(Task3GramParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link Task3GramParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExpr(Task3GramParser.IntExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SkipExpr}
	 * labeled alternative in {@link Task3GramParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipExpr(Task3GramParser.SkipExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task3GramParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(Task3GramParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task3GramParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(Task3GramParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task3GramParser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinop(Task3GramParser.BinopContext ctx);
}