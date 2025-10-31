package iostreams;

import java.io.*;

public class BRRead {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        char c;
        do {
            c = (char) b.read();
            System.out.println(c);
        } while(c != 'q');
    }
}
