package cc.glaciyan;

import cc.glaciyan.ipt.IPTLexer;
import cc.glaciyan.ipt.IPTParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class IPTFile {
    public static IPTNamed.List read(CharStream stream) throws IOException {
        IPTLexer lexer = new IPTLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        IPTParser parser = new IPTParser(tokens);
        ParseTree tree = parser.start();

        IPTFileVisitor visitor = new IPTFileVisitor();
        return (IPTNamed.List) visitor.visit(tree);
    }
}
