package iostreams;

import java.io.*;

public class BufferedConsoleInputDemo {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String  s = br.readLine();
        System.out.println(s);
    }
}
