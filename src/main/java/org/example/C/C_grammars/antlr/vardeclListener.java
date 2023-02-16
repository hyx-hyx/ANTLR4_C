// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link vardeclParser}.
 */
public interface vardeclListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link vardeclParser#debug}.
	 * @param ctx the parse tree
	 */
	void enterDebug(vardeclParser.DebugContext ctx);
	/**
	 * Exit a parse tree produced by {@link vardeclParser#debug}.
	 * @param ctx the parse tree
	 */
	void exitDebug(vardeclParser.DebugContext ctx);
	/**
	 * Enter a parse tree produced by {@link vardeclParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(vardeclParser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link vardeclParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(vardeclParser.VardeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link vardeclParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(vardeclParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link vardeclParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(vardeclParser.ExprContext ctx);
}