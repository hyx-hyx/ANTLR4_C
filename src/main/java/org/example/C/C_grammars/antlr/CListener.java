// Generated from java-escape by ANTLR 4.11.1
package org.example.C.C_grammars.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CParser}.
 */
public interface CListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CParser#debug}.
	 * @param ctx the parse tree
	 */
	void enterDebug(CParser.DebugContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#debug}.
	 * @param ctx the parse tree
	 */
	void exitDebug(CParser.DebugContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#c_parser}.
	 * @param ctx the parse tree
	 */
	void enterC_parser(CParser.C_parserContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#c_parser}.
	 * @param ctx the parse tree
	 */
	void exitC_parser(CParser.C_parserContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#define_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDefine_stmt(CParser.Define_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#define_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDefine_stmt(CParser.Define_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(CParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(CParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(CParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(CParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(CParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(CParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(CParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(CParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(CParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(CParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(CParser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(CParser.VardeclContext ctx);
}