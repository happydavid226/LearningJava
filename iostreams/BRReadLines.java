package iostreams;

import java.io.*;
import java.sql.SQLOutput;

public class BRReadLines {
    public static void main(String[] args) throws IOException{
        /* BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String [] file = new String[100];

        int i = 0;

        do {
            file[i++] = br1.readLine();

        } while(i < 100 && (!(file[i-1]).equalsIgnoreCase("save")));

        System.out.println("Your file is here : ");
        for(String myFileLine : file){
            if(myFileLine.equalsIgnoreCase("save"))
                break;
            System.out.println(myFileLine);
        }

        System.out.println("\n\nProgram finished");
        */
        int b = 'A';
        System.out.write(b);
        System.out.flush();

    }
}
