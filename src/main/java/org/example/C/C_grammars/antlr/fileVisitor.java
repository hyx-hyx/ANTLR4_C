// Generated from java-escape by ANTLR 4.11.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link fileParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface fileVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link fileParser#debug}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebug(fileParser.DebugContext ctx);
	/**
	 * Visit a parse tree produced by {@link fileParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(fileParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link fileParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(fileParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link fileParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(fileParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link fileParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(fileParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link fileParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(fileParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link fileParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(fileParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link fileParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(fileParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link fileParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(fileParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fileParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(fileParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link fileParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(fileParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link fileParser#type_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_assign(fileParser.Type_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link fileParser#expr_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_assign(fileParser.Expr_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link fileParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(fileParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link fileParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(fileParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link fileParser#callstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallstmt(fileParser.CallstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link fileParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(fileParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link fileParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecl(fileParser.VardeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link fileParser#head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHead(fileParser.HeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link fileParser#preprocess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreprocess(fileParser.PreprocessContext ctx);
}