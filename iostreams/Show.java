package iostreams;

import java.io.*;

public class Show {
    public static void main(String[] args){
        FileInputStream in;
        PrintWriter pw1 = new PrintWriter(System.out, true);

        if(args.length != 1){
            System.out.println("The syntax is \t\t java show filename.fileExtension");
            return;
        }
        try {
            in = new FileInputStream(args[0]);
        } catch(FileNotFoundException e){
            System.out.println("The file you said is not found");
            return;
        }

        try {
            int i;
            do {
                i = in.read();
                if(i != -1)
                    pw1.print((char) i);
            } while(i != -1);
            pw1.flush();
        } catch(IOException e){
            System.out.println("exception is caught" + e.getMessage());
        }
        finally {
            try{
                in.close();
            } catch(IOException e){
                System.out.println("failed to close the file");
            }
        }
    }
}
