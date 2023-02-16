// Generated from java-escape by ANTLR 4.11.1
package org.example.C.C_grammars.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CParser#debug}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebug(CParser.DebugContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#c_parser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_parser(CParser.C_parserContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#define_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_stmt(CParser.Define_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(CParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(CParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(CParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(CParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(CParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecl(CParser.VardeclContext ctx);
}