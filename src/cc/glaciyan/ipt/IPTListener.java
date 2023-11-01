// Generated from ./src/IPT.g4 by ANTLR 4.13.1
package cc.glaciyan.ipt;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IPTParser}.
 */
public interface IPTListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IPTParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(IPTParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link IPTParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(IPTParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link IPTParser#named}.
	 * @param ctx the parse tree
	 */
	void enterNamed(IPTParser.NamedContext ctx);
	/**
	 * Exit a parse tree produced by {@link IPTParser#named}.
	 * @param ctx the parse tree
	 */
	void exitNamed(IPTParser.NamedContext ctx);
	/**
	 * Enter a parse tree produced by {@link IPTParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(IPTParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link IPTParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(IPTParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link IPTParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(IPTParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link IPTParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(IPTParser.ListContext ctx);
}