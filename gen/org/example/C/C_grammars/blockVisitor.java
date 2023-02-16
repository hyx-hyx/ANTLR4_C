// Generated from java-escape by ANTLR 4.11.1
package org.example.C.C_grammars;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link blockParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface blockVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link blockParser#debug}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebug(blockParser.DebugContext ctx);
	/**
	 * Visit a parse tree produced by {@link blockParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(blockParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link blockParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(blockParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link blockParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(blockParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link blockParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(blockParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link blockParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(blockParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link blockParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(blockParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link blockParser#for_first_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_first_expr(blockParser.For_first_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link blockParser#for_third_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_third_expr(blockParser.For_third_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link blockParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(blockParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link blockParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecl(blockParser.VardeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link blockParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(blockParser.CallContext ctx);
}