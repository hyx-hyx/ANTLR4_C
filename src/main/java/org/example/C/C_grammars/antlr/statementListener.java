// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link statementParser}.
 */
public interface statementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link statementParser#debug}.
	 * @param ctx the parse tree
	 */
	void enterDebug(statementParser.DebugContext ctx);
	/**
	 * Exit a parse tree produced by {@link statementParser#debug}.
	 * @param ctx the parse tree
	 */
	void exitDebug(statementParser.DebugContext ctx);
	/**
	 * Enter a parse tree produced by {@link statementParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(statementParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link statementParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(statementParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link statementParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(statementParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link statementParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(statementParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link statementParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(statementParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link statementParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(statementParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link statementParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(statementParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link statementParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(statementParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link statementParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(statementParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link statementParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(statementParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link statementParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(statementParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link statementParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(statementParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link statementParser#type_assign}.
	 * @param ctx the parse tree
	 */
	void enterType_assign(statementParser.Type_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link statementParser#type_assign}.
	 * @param ctx the parse tree
	 */
	void exitType_assign(statementParser.Type_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link statementParser#expr_assign}.
	 * @param ctx the parse tree
	 */
	void enterExpr_assign(statementParser.Expr_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link statementParser#expr_assign}.
	 * @param ctx the parse tree
	 */
	void exitExpr_assign(statementParser.Expr_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link statementParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(statementParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link statementParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(statementParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link statementParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(statementParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link statementParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(statementParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link statementParser#callstmt}.
	 * @param ctx the parse tree
	 */
	void enterCallstmt(statementParser.CallstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link statementParser#callstmt}.
	 * @param ctx the parse tree
	 */
	void exitCallstmt(statementParser.CallstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link statementParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(statementParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link statementParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(statementParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link statementParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(statementParser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link statementParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(statementParser.VardeclContext ctx);
}