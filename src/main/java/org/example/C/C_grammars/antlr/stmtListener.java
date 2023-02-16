// Generated from java-escape by ANTLR 4.11.1
package org.example.C.C_grammars.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link stmtParser}.
 */
public interface stmtListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link stmtParser#debug}.
	 * @param ctx the parse tree
	 */
	void enterDebug(stmtParser.DebugContext ctx);
	/**
	 * Exit a parse tree produced by {@link stmtParser#debug}.
	 * @param ctx the parse tree
	 */
	void exitDebug(stmtParser.DebugContext ctx);
	/**
	 * Enter a parse tree produced by {@link stmtParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(stmtParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link stmtParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(stmtParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link stmtParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(stmtParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link stmtParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(stmtParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link stmtParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(stmtParser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link stmtParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(stmtParser.VardeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link stmtParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(stmtParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link stmtParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(stmtParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link stmtParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(stmtParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link stmtParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(stmtParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link stmtParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(stmtParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link stmtParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(stmtParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link stmtParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(stmtParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link stmtParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(stmtParser.For_stmtContext ctx);
}