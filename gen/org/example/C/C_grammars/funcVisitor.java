// Generated from java-escape by ANTLR 4.11.1
package org.example.C.C_grammars;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link funcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface funcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link funcParser#debug}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebug(funcParser.DebugContext ctx);
	/**
	 * Visit a parse tree produced by {@link funcParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(funcParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link funcParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(funcParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link funcParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(funcParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link funcParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(funcParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link funcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(funcParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link funcParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(funcParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link funcParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(funcParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link funcParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(funcParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link funcParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(funcParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link funcParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(funcParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link funcParser#callstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallstmt(funcParser.CallstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link funcParser#for_first_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_first_expr(funcParser.For_first_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link funcParser#for_third_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_third_expr(funcParser.For_third_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link funcParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(funcParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link funcParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecl(funcParser.VardeclContext ctx);
}