// Generated from C:/Users/Malte/IdeaProjects/GameScript/src/main/antlr\GameScript.g4 by ANTLR 4.8
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GameScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GameScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GameScriptParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GameScriptParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StartBlock}
	 * labeled alternative in {@link GameScriptParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartBlock(GameScriptParser.StartBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameScriptParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(GameScriptParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameScriptParser#commandBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandBlock(GameScriptParser.CommandBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link GameScriptParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(GameScriptParser.PrintContext ctx);
}