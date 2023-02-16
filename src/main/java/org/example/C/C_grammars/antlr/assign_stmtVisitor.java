// Generated from java-escape by ANTLR 4.11.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link assign_stmtParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface assign_stmtVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link assign_stmtParser#debug}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebug(assign_stmtParser.DebugContext ctx);
	/**
	 * Visit a parse tree produced by {@link assign_stmtParser#type_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_assign(assign_stmtParser.Type_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link assign_stmtParser#expr_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_assign(assign_stmtParser.Expr_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link assign_stmtParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(assign_stmtParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link assign_stmtParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(assign_stmtParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link assign_stmtParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(assign_stmtParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link assign_stmtParser#callstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallstmt(assign_stmtParser.CallstmtContext ctx);
}