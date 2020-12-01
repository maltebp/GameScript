import antlr.GameScriptBaseVisitor;
import antlr.GameScriptLexer;
import antlr.GameScriptParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {


        // Run
        // open the input file
        CharStream input = CharStreams.fromFileName("test.gs");

        // create a lexer/scanner
        GameScriptLexer lex = new GameScriptLexer(input);

        // get the stream of tokens from the scanner
        CommonTokenStream tokens = new CommonTokenStream(lex);

        // create a parser
        GameScriptParser parser = new GameScriptParser(tokens);

        // and parse anything from the grammar for "start"
        ParseTree parseTree = parser.program();

        // Construct an interpreter and run it on the parse tree
        Interpreter interpreter = new Interpreter();
        interpreter.visit(parseTree);
    }



    static class Interpreter extends GameScriptBaseVisitor<Double> {


        @Override
        public Double visitProgram(GameScriptParser.ProgramContext ctx) {

            return super.visitProgram(ctx);
        }


        @Override
        public Double visitPrint(GameScriptParser.PrintContext ctx) {
            String totalString = ctx.output.getText();


            System.out.println("Console: " + totalString.substring(1, totalString.length()-1));
            return null;
        }
    }

}
