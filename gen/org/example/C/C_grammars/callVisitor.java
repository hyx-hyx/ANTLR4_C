// Generated from java-escape by ANTLR 4.11.1
package org.example.C.C_grammars;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link callParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface callVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link callParser#debug}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebug(callParser.DebugContext ctx);
	/**
	 * Visit a parse tree produced by {@link callParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(callParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link callParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(callParser.ExprContext ctx);
}