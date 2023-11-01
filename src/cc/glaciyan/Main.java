package cc.glaciyan;

import cc.glaciyan.ipt.IPTLexer;
import cc.glaciyan.ipt.IPTParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
    private final static String FILE = """
            ipt = {
            \tmode = "cut",
            \tbase = {"zev_no02_1", x=-640, y=-360, w=2560, h=1440, ax=1280, ay=720 },
            \t{ id=1, file="zev_no02_1_01", x=0, y=0 },
            \t{ id=2, file="zev_no02_1_02", x=2048, y=0 },
            }
            """;

    public static void main(String[] args) {
        IPTLexer lexer = new IPTLexer(CharStreams.fromString(FILE));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        IPTParser parser = new IPTParser(tokens);
        ParseTree tree = parser.start();

        IPTFileVisitor visitor = new IPTFileVisitor();
        IPTAny output = visitor.visit(tree);

        System.out.println(output);
    }
}