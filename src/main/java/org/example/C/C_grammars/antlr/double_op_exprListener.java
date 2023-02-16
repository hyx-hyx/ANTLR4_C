// Generated from java-escape by ANTLR 4.11.1
package org.example.C.C_grammars.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link double_op_exprParser}.
 */
public interface double_op_exprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link double_op_exprParser#debug}.
	 * @param ctx the parse tree
	 */
	void enterDebug(double_op_exprParser.DebugContext ctx);
	/**
	 * Exit a parse tree produced by {@link double_op_exprParser#debug}.
	 * @param ctx the parse tree
	 */
	void exitDebug(double_op_exprParser.DebugContext ctx);
	/**
	 * Enter a parse tree produced by {@link double_op_exprParser#double_op_expr}.
	 * @param ctx the parse tree
	 */
	void enterDouble_op_expr(double_op_exprParser.Double_op_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link double_op_exprParser#double_op_expr}.
	 * @param ctx the parse tree
	 */
	void exitDouble_op_expr(double_op_exprParser.Double_op_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link double_op_exprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(double_op_exprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link double_op_exprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(double_op_exprParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link double_op_exprParser#single_op_expr}.
	 * @param ctx the parse tree
	 */
	void enterSingle_op_expr(double_op_exprParser.Single_op_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link double_op_exprParser#single_op_expr}.
	 * @param ctx the parse tree
	 */
	void exitSingle_op_expr(double_op_exprParser.Single_op_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link double_op_exprParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(double_op_exprParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link double_op_exprParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(double_op_exprParser.ObjectContext ctx);
}