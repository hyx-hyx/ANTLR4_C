// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link callstmtParser}.
 */
public interface callstmtListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link callstmtParser#debug}.
	 * @param ctx the parse tree
	 */
	void enterDebug(callstmtParser.DebugContext ctx);
	/**
	 * Exit a parse tree produced by {@link callstmtParser#debug}.
	 * @param ctx the parse tree
	 */
	void exitDebug(callstmtParser.DebugContext ctx);
	/**
	 * Enter a parse tree produced by {@link callstmtParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(callstmtParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link callstmtParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(callstmtParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link callstmtParser#callstmt}.
	 * @param ctx the parse tree
	 */
	void enterCallstmt(callstmtParser.CallstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link callstmtParser#callstmt}.
	 * @param ctx the parse tree
	 */
	void exitCallstmt(callstmtParser.CallstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link callstmtParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(callstmtParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link callstmtParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(callstmtParser.ExprContext ctx);
}