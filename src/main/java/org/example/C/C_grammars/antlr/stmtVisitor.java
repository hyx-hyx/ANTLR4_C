// Generated from java-escape by ANTLR 4.11.1
package org.example.C.C_grammars.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link stmtParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface stmtVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link stmtParser#debug}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebug(stmtParser.DebugContext ctx);
	/**
	 * Visit a parse tree produced by {@link stmtParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(stmtParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link stmtParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(stmtParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link stmtParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecl(stmtParser.VardeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link stmtParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(stmtParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link stmtParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(stmtParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link stmtParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(stmtParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link stmtParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(stmtParser.For_stmtContext ctx);
}