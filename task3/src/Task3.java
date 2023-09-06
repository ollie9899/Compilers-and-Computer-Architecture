import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Task3 {

    public static void main(String[] args) throws Exception {

        String out;
        // create a CharStream that reads from standard input
        CharStream input = CharStreams.fromStream(System.in);

        // create a lexer that feeds off of input CharStream
        Task3GramLexer lexer = new Task3GramLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        Task3GramParser parser = new Task3GramParser(tokens);
        ParseTree tree = parser.prog(); // begin parsing at prog rule

        CodeGenerator codeGen = new CodeGenerator();
        out = codeGen.visit(tree);
        System.out.print(out);
    }
}