package item9.yhkim;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.util.Arrays;

public class Main {
    private final static int BUFFER_SIZE = 10;

    public static void main(String[] args) throws IOException {
        test();
    }

    public static void test() {
        copy("/dd", "");
    }

    static void copy(String src, String dst) {
        try (InputStream in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dst)) {
            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0)
            out.write(buf, 0, n);
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getSuppressed()));
        }
    }

    static String firstLineOfFile(String path) {
        try (BufferedReader br = new BufferedReader(
                new FileReader(path))) {
            return br.readLine();
        } catch (IOException e) {
             return e.getMessage();
        }
    }
}
