// Generated from java-escape by ANTLR 4.11.1
package org.example.C.C_grammars;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link fileParser}.
 */
public interface fileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link fileParser#debug}.
	 * @param ctx the parse tree
	 */
	void enterDebug(fileParser.DebugContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#debug}.
	 * @param ctx the parse tree
	 */
	void exitDebug(fileParser.DebugContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(fileParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(fileParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#preprocess}.
	 * @param ctx the parse tree
	 */
	void enterPreprocess(fileParser.PreprocessContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#preprocess}.
	 * @param ctx the parse tree
	 */
	void exitPreprocess(fileParser.PreprocessContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(fileParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(fileParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(fileParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(fileParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(fileParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(fileParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(fileParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(fileParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(fileParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(fileParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(fileParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(fileParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(fileParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(fileParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(fileParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(fileParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(fileParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(fileParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(fileParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(fileParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#callstmt}.
	 * @param ctx the parse tree
	 */
	void enterCallstmt(fileParser.CallstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#callstmt}.
	 * @param ctx the parse tree
	 */
	void exitCallstmt(fileParser.CallstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#for_first_expr}.
	 * @param ctx the parse tree
	 */
	void enterFor_first_expr(fileParser.For_first_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#for_first_expr}.
	 * @param ctx the parse tree
	 */
	void exitFor_first_expr(fileParser.For_first_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#for_third_expr}.
	 * @param ctx the parse tree
	 */
	void enterFor_third_expr(fileParser.For_third_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#for_third_expr}.
	 * @param ctx the parse tree
	 */
	void exitFor_third_expr(fileParser.For_third_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(fileParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(fileParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(fileParser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(fileParser.VardeclContext ctx);
}