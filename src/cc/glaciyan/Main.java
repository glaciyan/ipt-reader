package cc.glaciyan;

import java.io.File;
import java.io.IOException;

public class Main {
    private final static String FILE_PATH = "./sample.ipt";

    public static void main(String[] args) {
        File f = new File(args.length == 0 ? FILE_PATH : args[0]);
        try {
            IPTFile file = new IPTFile(f);
            IPTAny ipt = file.read();
            System.out.println(ipt);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}