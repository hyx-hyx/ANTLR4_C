// Generated from java-escape by ANTLR 4.11.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link callstmtParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface callstmtVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link callstmtParser#debug}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebug(callstmtParser.DebugContext ctx);
	/**
	 * Visit a parse tree produced by {@link callstmtParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(callstmtParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link callstmtParser#callstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallstmt(callstmtParser.CallstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link callstmtParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(callstmtParser.ExprContext ctx);
}