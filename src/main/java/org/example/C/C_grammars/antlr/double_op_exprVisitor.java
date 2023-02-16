// Generated from java-escape by ANTLR 4.11.1
package org.example.C.C_grammars.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link double_op_exprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface double_op_exprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link double_op_exprParser#debug}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebug(double_op_exprParser.DebugContext ctx);
	/**
	 * Visit a parse tree produced by {@link double_op_exprParser#double_op_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_op_expr(double_op_exprParser.Double_op_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link double_op_exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(double_op_exprParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link double_op_exprParser#single_op_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_op_expr(double_op_exprParser.Single_op_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link double_op_exprParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(double_op_exprParser.ObjectContext ctx);
}