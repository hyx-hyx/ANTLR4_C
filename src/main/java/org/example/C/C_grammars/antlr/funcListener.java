// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link funcParser}.
 */
public interface funcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link funcParser#debug}.
	 * @param ctx the parse tree
	 */
	void enterDebug(funcParser.DebugContext ctx);
	/**
	 * Exit a parse tree produced by {@link funcParser#debug}.
	 * @param ctx the parse tree
	 */
	void exitDebug(funcParser.DebugContext ctx);
	/**
	 * Enter a parse tree produced by {@link funcParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(funcParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link funcParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(funcParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link funcParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(funcParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link funcParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(funcParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link funcParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(funcParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link funcParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(funcParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link funcParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(funcParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link funcParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(funcParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link funcParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(funcParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link funcParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(funcParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link funcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(funcParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link funcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(funcParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link funcParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(funcParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link funcParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(funcParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link funcParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(funcParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link funcParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(funcParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link funcParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(funcParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link funcParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(funcParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link funcParser#type_assign}.
	 * @param ctx the parse tree
	 */
	void enterType_assign(funcParser.Type_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link funcParser#type_assign}.
	 * @param ctx the parse tree
	 */
	void exitType_assign(funcParser.Type_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link funcParser#expr_assign}.
	 * @param ctx the parse tree
	 */
	void enterExpr_assign(funcParser.Expr_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link funcParser#expr_assign}.
	 * @param ctx the parse tree
	 */
	void exitExpr_assign(funcParser.Expr_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link funcParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(funcParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link funcParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(funcParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link funcParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(funcParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link funcParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(funcParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link funcParser#callstmt}.
	 * @param ctx the parse tree
	 */
	void enterCallstmt(funcParser.CallstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link funcParser#callstmt}.
	 * @param ctx the parse tree
	 */
	void exitCallstmt(funcParser.CallstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link funcParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(funcParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link funcParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(funcParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link funcParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(funcParser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link funcParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(funcParser.VardeclContext ctx);
}