// Generated from java-escape by ANTLR 4.11.1
package org.example.C.C_grammars.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link preprocessParser}.
 */
public interface preprocessListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link preprocessParser#debug}.
	 * @param ctx the parse tree
	 */
	void enterDebug(preprocessParser.DebugContext ctx);
	/**
	 * Exit a parse tree produced by {@link preprocessParser#debug}.
	 * @param ctx the parse tree
	 */
	void exitDebug(preprocessParser.DebugContext ctx);
	/**
	 * Enter a parse tree produced by {@link preprocessParser#preprocess}.
	 * @param ctx the parse tree
	 */
	void enterPreprocess(preprocessParser.PreprocessContext ctx);
	/**
	 * Exit a parse tree produced by {@link preprocessParser#preprocess}.
	 * @param ctx the parse tree
	 */
	void exitPreprocess(preprocessParser.PreprocessContext ctx);
	/**
	 * Enter a parse tree produced by {@link preprocessParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(preprocessParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link preprocessParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(preprocessParser.ExprContext ctx);
}