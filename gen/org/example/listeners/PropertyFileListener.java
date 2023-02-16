// Generated from java-escape by ANTLR 4.11.1
package org.example.listeners;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PropertyFileParser}.
 */
public interface PropertyFileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PropertyFileParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(PropertyFileParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PropertyFileParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(PropertyFileParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PropertyFileParser#proc}.
	 * @param ctx the parse tree
	 */
	void enterProc(PropertyFileParser.ProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link PropertyFileParser#proc}.
	 * @param ctx the parse tree
	 */
	void exitProc(PropertyFileParser.ProcContext ctx);
}