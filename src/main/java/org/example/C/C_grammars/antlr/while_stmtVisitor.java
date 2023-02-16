// Generated from java-escape by ANTLR 4.11.1
package org.example.C.C_grammars.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link while_stmtParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface while_stmtVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link while_stmtParser#debug}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebug(while_stmtParser.DebugContext ctx);
	/**
	 * Visit a parse tree produced by {@link while_stmtParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(while_stmtParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link while_stmtParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(while_stmtParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link while_stmtParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(while_stmtParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link while_stmtParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(while_stmtParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link while_stmtParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(while_stmtParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link while_stmtParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(while_stmtParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link while_stmtParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(while_stmtParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link while_stmtParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecl(while_stmtParser.VardeclContext ctx);
}