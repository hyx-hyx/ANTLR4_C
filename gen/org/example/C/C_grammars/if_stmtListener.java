// Generated from java-escape by ANTLR 4.11.1
package org.example.C.C_grammars;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link if_stmtParser}.
 */
public interface if_stmtListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link if_stmtParser#debug}.
	 * @param ctx the parse tree
	 */
	void enterDebug(if_stmtParser.DebugContext ctx);
	/**
	 * Exit a parse tree produced by {@link if_stmtParser#debug}.
	 * @param ctx the parse tree
	 */
	void exitDebug(if_stmtParser.DebugContext ctx);
	/**
	 * Enter a parse tree produced by {@link if_stmtParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(if_stmtParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link if_stmtParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(if_stmtParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link if_stmtParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(if_stmtParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link if_stmtParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(if_stmtParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link if_stmtParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(if_stmtParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link if_stmtParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(if_stmtParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link if_stmtParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(if_stmtParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link if_stmtParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(if_stmtParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link if_stmtParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(if_stmtParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link if_stmtParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(if_stmtParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link if_stmtParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(if_stmtParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link if_stmtParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(if_stmtParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link if_stmtParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(if_stmtParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link if_stmtParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(if_stmtParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link if_stmtParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(if_stmtParser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link if_stmtParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(if_stmtParser.VardeclContext ctx);
}