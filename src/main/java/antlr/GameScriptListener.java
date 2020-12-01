// Generated from C:/Users/Malte/IdeaProjects/GameScript/src/main/antlr\GameScript.g4 by ANTLR 4.8
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GameScriptParser}.
 */
public interface GameScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GameScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GameScriptParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GameScriptParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StartBlock}
	 * labeled alternative in {@link GameScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void enterStartBlock(GameScriptParser.StartBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StartBlock}
	 * labeled alternative in {@link GameScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void exitStartBlock(GameScriptParser.StartBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameScriptParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GameScriptParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameScriptParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GameScriptParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameScriptParser#commandBlock}.
	 * @param ctx the parse tree
	 */
	void enterCommandBlock(GameScriptParser.CommandBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameScriptParser#commandBlock}.
	 * @param ctx the parse tree
	 */
	void exitCommandBlock(GameScriptParser.CommandBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Print}
	 * labeled alternative in {@link GameScriptParser#command}.
	 * @param ctx the parse tree
	 */
	void enterPrint(GameScriptParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link GameScriptParser#command}.
	 * @param ctx the parse tree
	 */
	void exitPrint(GameScriptParser.PrintContext ctx);
}