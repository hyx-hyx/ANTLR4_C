// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CParser}.
 */
public interface CListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CParser#debug}.
	 * @param ctx the parse tree
	 */
	void enterDebug(CParser.DebugContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#debug}.
	 * @param ctx the parse tree
	 */
	void exitDebug(CParser.DebugContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#head}.
	 * @param ctx the parse tree
	 */
	void enterHead(CParser.HeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#head}.
	 * @param ctx the parse tree
	 */
	void exitHead(CParser.HeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#preprocess}.
	 * @param ctx the parse tree
	 */
	void enterPreprocess(CParser.PreprocessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#preprocess}.
	 * @param ctx the parse tree
	 */
	void exitPreprocess(CParser.PreprocessContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(CParser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(CParser.VardeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(CParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(CParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(CParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(CParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(CParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(CParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(CParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(CParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(CParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(CParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(CParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(CParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(CParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(CParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(CParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(CParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#callstmt}.
	 * @param ctx the parse tree
	 */
	void enterCallstmt(CParser.CallstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#callstmt}.
	 * @param ctx the parse tree
	 */
	void exitCallstmt(CParser.CallstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(CParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(CParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#type_assign}.
	 * @param ctx the parse tree
	 */
	void enterType_assign(CParser.Type_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#type_assign}.
	 * @param ctx the parse tree
	 */
	void exitType_assign(CParser.Type_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#expr_assign}.
	 * @param ctx the parse tree
	 */
	void enterExpr_assign(CParser.Expr_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#expr_assign}.
	 * @param ctx the parse tree
	 */
	void exitExpr_assign(CParser.Expr_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(CParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(CParser.Assign_stmtContext ctx);
}