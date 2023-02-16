// Generated from java-escape by ANTLR 4.11.1
package org.example.C.C_grammars;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link callParser}.
 */
public interface callListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link callParser#debug}.
	 * @param ctx the parse tree
	 */
	void enterDebug(callParser.DebugContext ctx);
	/**
	 * Exit a parse tree produced by {@link callParser#debug}.
	 * @param ctx the parse tree
	 */
	void exitDebug(callParser.DebugContext ctx);
	/**
	 * Enter a parse tree produced by {@link callParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(callParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link callParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(callParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link callParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(callParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link callParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(callParser.ExprContext ctx);
}