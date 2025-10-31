package iostreams;

import java.io.*;

public class PrintWriterDemo {
    public static void main(String[] args){
        PrintWriter pw = new PrintWriter(System.out, true);
        int i = 5;
        double d = 5e-7;
        String s1 = "david";
        pw.println(i);
        pw.println(d);
        pw.println(s1);
    }
}
