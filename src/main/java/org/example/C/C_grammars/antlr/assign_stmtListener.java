// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link assign_stmtParser}.
 */
public interface assign_stmtListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link assign_stmtParser#debug}.
	 * @param ctx the parse tree
	 */
	void enterDebug(assign_stmtParser.DebugContext ctx);
	/**
	 * Exit a parse tree produced by {@link assign_stmtParser#debug}.
	 * @param ctx the parse tree
	 */
	void exitDebug(assign_stmtParser.DebugContext ctx);
	/**
	 * Enter a parse tree produced by {@link assign_stmtParser#type_assign}.
	 * @param ctx the parse tree
	 */
	void enterType_assign(assign_stmtParser.Type_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link assign_stmtParser#type_assign}.
	 * @param ctx the parse tree
	 */
	void exitType_assign(assign_stmtParser.Type_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link assign_stmtParser#expr_assign}.
	 * @param ctx the parse tree
	 */
	void enterExpr_assign(assign_stmtParser.Expr_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link assign_stmtParser#expr_assign}.
	 * @param ctx the parse tree
	 */
	void exitExpr_assign(assign_stmtParser.Expr_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link assign_stmtParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(assign_stmtParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link assign_stmtParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(assign_stmtParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link assign_stmtParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(assign_stmtParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link assign_stmtParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(assign_stmtParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link assign_stmtParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(assign_stmtParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link assign_stmtParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(assign_stmtParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link assign_stmtParser#callstmt}.
	 * @param ctx the parse tree
	 */
	void enterCallstmt(assign_stmtParser.CallstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link assign_stmtParser#callstmt}.
	 * @param ctx the parse tree
	 */
	void exitCallstmt(assign_stmtParser.CallstmtContext ctx);
}