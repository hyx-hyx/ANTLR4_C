// Generated from java-escape by ANTLR 4.11.1
package org.example.C.C_grammars;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link for_stmtParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface for_stmtVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link for_stmtParser#debug}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebug(for_stmtParser.DebugContext ctx);
	/**
	 * Visit a parse tree produced by {@link for_stmtParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(for_stmtParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link for_stmtParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(for_stmtParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link for_stmtParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(for_stmtParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link for_stmtParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(for_stmtParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link for_stmtParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(for_stmtParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link for_stmtParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(for_stmtParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link for_stmtParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(for_stmtParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link for_stmtParser#type_assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_assign_stmt(for_stmtParser.Type_assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link for_stmtParser#expr_assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_assign_stmt(for_stmtParser.Expr_assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link for_stmtParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(for_stmtParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link for_stmtParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(for_stmtParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link for_stmtParser#callstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallstmt(for_stmtParser.CallstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link for_stmtParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecl(for_stmtParser.VardeclContext ctx);
}