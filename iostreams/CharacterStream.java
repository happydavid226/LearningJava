package iostreams;

import java.io.*;

public class CharacterStream{
    public static void main(String[] args) throws IOException{
        FileReader in = null;
        FileWriter out = null;
        try {
            in = new FileReader("input.txt");
            out = new FileWriter("output.txt");
            int c;
            while((c = in.read()) != -1) {
                out.write(c);
                System.out.println(c);
            }
        } finally {
            if(in != null){
                in.close();
            }
            if(out != null){
                out.close();
            }
        }
        System.out.println("Program finished");
    }
}
