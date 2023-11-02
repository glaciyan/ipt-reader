package cc.glaciyan;

import cc.glaciyan.ipt.IPTLexer;
import cc.glaciyan.ipt.IPTParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IPTFile {
    private final File f;

    public IPTFile(String name) {
        f = new File(name);
    }

    public IPTFile(File f) {
        this.f = f;
    }

    public IPTAny read() throws IOException {
        var fileStream = new FileInputStream(f);
        CharStream stream = CharStreams.fromStream(fileStream);
        IPTLexer lexer = new IPTLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        IPTParser parser = new IPTParser(tokens);
        ParseTree tree = parser.start();

        IPTFileVisitor visitor = new IPTFileVisitor();
        IPTAny output = visitor.visit(tree);
        fileStream.close();
        return output;
    }
}
