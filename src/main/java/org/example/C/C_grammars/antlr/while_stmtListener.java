// Generated from java-escape by ANTLR 4.11.1
package org.example.C.C_grammars.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link while_stmtParser}.
 */
public interface while_stmtListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link while_stmtParser#debug}.
	 * @param ctx the parse tree
	 */
	void enterDebug(while_stmtParser.DebugContext ctx);
	/**
	 * Exit a parse tree produced by {@link while_stmtParser#debug}.
	 * @param ctx the parse tree
	 */
	void exitDebug(while_stmtParser.DebugContext ctx);
	/**
	 * Enter a parse tree produced by {@link while_stmtParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(while_stmtParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link while_stmtParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(while_stmtParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link while_stmtParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(while_stmtParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link while_stmtParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(while_stmtParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link while_stmtParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(while_stmtParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link while_stmtParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(while_stmtParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link while_stmtParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(while_stmtParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link while_stmtParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(while_stmtParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link while_stmtParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(while_stmtParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link while_stmtParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(while_stmtParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link while_stmtParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(while_stmtParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link while_stmtParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(while_stmtParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link while_stmtParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(while_stmtParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link while_stmtParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(while_stmtParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link while_stmtParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(while_stmtParser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link while_stmtParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(while_stmtParser.VardeclContext ctx);
}