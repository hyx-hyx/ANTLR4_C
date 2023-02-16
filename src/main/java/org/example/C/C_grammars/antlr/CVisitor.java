// Generated from java-escape by ANTLR 4.11.1
package antlr;
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
	 * Visit a parse tree produced by {@link CParser#head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHead(CParser.HeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#preprocess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreprocess(CParser.PreprocessContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecl(CParser.VardeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(CParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(CParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(CParser.For_stmtContext ctx);
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
	 * Visit a parse tree produced by {@link CParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(CParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(CParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#callstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallstmt(CParser.CallstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(CParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#type_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_assign(CParser.Type_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#expr_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_assign(CParser.Expr_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(CParser.Assign_stmtContext ctx);
}