// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link blockParser}.
 */
public interface blockListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link blockParser#debug}.
	 * @param ctx the parse tree
	 */
	void enterDebug(blockParser.DebugContext ctx);
	/**
	 * Exit a parse tree produced by {@link blockParser#debug}.
	 * @param ctx the parse tree
	 */
	void exitDebug(blockParser.DebugContext ctx);
	/**
	 * Enter a parse tree produced by {@link blockParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(blockParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link blockParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(blockParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link blockParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(blockParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link blockParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(blockParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link blockParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(blockParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link blockParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(blockParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link blockParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(blockParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link blockParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(blockParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link blockParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(blockParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link blockParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(blockParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link blockParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(blockParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link blockParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(blockParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link blockParser#type_assign}.
	 * @param ctx the parse tree
	 */
	void enterType_assign(blockParser.Type_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link blockParser#type_assign}.
	 * @param ctx the parse tree
	 */
	void exitType_assign(blockParser.Type_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link blockParser#expr_assign}.
	 * @param ctx the parse tree
	 */
	void enterExpr_assign(blockParser.Expr_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link blockParser#expr_assign}.
	 * @param ctx the parse tree
	 */
	void exitExpr_assign(blockParser.Expr_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link blockParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(blockParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link blockParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(blockParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link blockParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(blockParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link blockParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(blockParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link blockParser#callstmt}.
	 * @param ctx the parse tree
	 */
	void enterCallstmt(blockParser.CallstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link blockParser#callstmt}.
	 * @param ctx the parse tree
	 */
	void exitCallstmt(blockParser.CallstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link blockParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(blockParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link blockParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(blockParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link blockParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(blockParser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link blockParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(blockParser.VardeclContext ctx);
}