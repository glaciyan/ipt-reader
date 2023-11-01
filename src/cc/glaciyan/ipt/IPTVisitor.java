// Generated from ./src/IPT.g4 by ANTLR 4.13.1
package cc.glaciyan.ipt;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IPTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IPTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IPTParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(IPTParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link IPTParser#named}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamed(IPTParser.NamedContext ctx);
	/**
	 * Visit a parse tree produced by {@link IPTParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(IPTParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link IPTParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(IPTParser.ListContext ctx);
}