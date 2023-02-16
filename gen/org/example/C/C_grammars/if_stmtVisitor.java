// Generated from java-escape by ANTLR 4.11.1
package org.example.C.C_grammars;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link if_stmtParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface if_stmtVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link if_stmtParser#debug}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebug(if_stmtParser.DebugContext ctx);
	/**
	 * Visit a parse tree produced by {@link if_stmtParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(if_stmtParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link if_stmtParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(if_stmtParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link if_stmtParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(if_stmtParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link if_stmtParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(if_stmtParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link if_stmtParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(if_stmtParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link if_stmtParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(if_stmtParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link if_stmtParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(if_stmtParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link if_stmtParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecl(if_stmtParser.VardeclContext ctx);
}