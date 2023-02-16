// Generated from java-escape by ANTLR 4.11.1
package org.example.C.C_grammars.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link for_stmtParser}.
 */
public interface for_stmtListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link for_stmtParser#debug}.
	 * @param ctx the parse tree
	 */
	void enterDebug(for_stmtParser.DebugContext ctx);
	/**
	 * Exit a parse tree produced by {@link for_stmtParser#debug}.
	 * @param ctx the parse tree
	 */
	void exitDebug(for_stmtParser.DebugContext ctx);
	/**
	 * Enter a parse tree produced by {@link for_stmtParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(for_stmtParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link for_stmtParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(for_stmtParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link for_stmtParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(for_stmtParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link for_stmtParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(for_stmtParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link for_stmtParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(for_stmtParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link for_stmtParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(for_stmtParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link for_stmtParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(for_stmtParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link for_stmtParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(for_stmtParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link for_stmtParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(for_stmtParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link for_stmtParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(for_stmtParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link for_stmtParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(for_stmtParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link for_stmtParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(for_stmtParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link for_stmtParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(for_stmtParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link for_stmtParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(for_stmtParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link for_stmtParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(for_stmtParser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link for_stmtParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(for_stmtParser.VardeclContext ctx);
}