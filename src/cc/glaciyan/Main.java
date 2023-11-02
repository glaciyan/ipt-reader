package cc.glaciyan;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    private final static String FILE_PATH = "./sample.ipt";

    public static void main(String[] args) {
        File f = new File(args.length == 0 ? FILE_PATH : args[0]);
        try (var input = new FileInputStream(f)) {
            CharStream stream = CharStreams.fromStream(input);
            IPTAny ipt = IPTFile.read(stream);
            System.out.println(ipt);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}