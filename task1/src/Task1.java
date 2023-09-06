import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class Task1 {
    public static void main(String[] args) throws Exception {

        String outputString;
        String inputString;
        // create a CharStream that reads from standard input
        CharStream input = CharStreams.fromStream(System.in);
        // create a lexer that feeds off of input CharStream
        CWorkGramLexer lexer = new CWorkGramLexer(input);
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
        CWorkGramParser parser = new CWorkGramParser(tokens);
        ParseTree tree = parser.wholeexpr();

        Converter converter = new Converter();
        //System.out.println(converter.visit(tree));
        inputString = converter.visit(tree);


        outputString = G5035_S_Expression_PrettyPrinter.prettyPrint( inputString );
        System.out.println(outputString);
    }

}
