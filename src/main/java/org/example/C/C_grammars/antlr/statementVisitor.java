// Generated from java-escape by ANTLR 4.11.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link statementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface statementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link statementParser#debug}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebug(statementParser.DebugContext ctx);
	/**
	 * Visit a parse tree produced by {@link statementParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(statementParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link statementParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(statementParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link statementParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(statementParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link statementParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(statementParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link statementParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(statementParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link statementParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(statementParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link statementParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(statementParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link statementParser#callstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallstmt(statementParser.CallstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link statementParser#for_first_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_first_expr(statementParser.For_first_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link statementParser#for_third_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_third_expr(statementParser.For_third_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link statementParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(statementParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link statementParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecl(statementParser.VardeclContext ctx);
}