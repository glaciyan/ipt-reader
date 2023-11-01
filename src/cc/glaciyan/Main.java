package cc.glaciyan;

import cc.glaciyan.ipt.IPTLexer;
import cc.glaciyan.ipt.IPTParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileInputStream;

public class Main {
    private final static String FILE_PATH = "./sample.ipt";

    public static void main(String[] args) {
        File f = new File(FILE_PATH);
        try (var fileStream = new FileInputStream(f)) {
            CharStream stream = CharStreams.fromStream(fileStream);
            IPTLexer lexer = new IPTLexer(stream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            IPTParser parser = new IPTParser(tokens);
            ParseTree tree = parser.start();

            IPTFileVisitor visitor = new IPTFileVisitor();
            IPTAny output = visitor.visit(tree);

            System.out.println(output);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}