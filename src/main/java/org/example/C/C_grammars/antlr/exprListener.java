// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link exprParser}.
 */
public interface exprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link exprParser#debug}.
	 * @param ctx the parse tree
	 */
	void enterDebug(exprParser.DebugContext ctx);
	/**
	 * Exit a parse tree produced by {@link exprParser#debug}.
	 * @param ctx the parse tree
	 */
	void exitDebug(exprParser.DebugContext ctx);
	/**
	 * Enter a parse tree produced by {@link exprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(exprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link exprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(exprParser.ExprContext ctx);
}