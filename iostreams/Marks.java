package iostreams;

import java.io.*;
import java.util.*;

public class Marks {
    public static void main(String[] args) throws IOException {
        Scanner s = null;
        double  sum = 0;
        try {
            s = new Scanner(new BufferedReader(new FileReader("marks.rca")));
            s.useLocale(Locale.US);
            while(s.hasNext()) {
                if(s.hasNext()){
                    sum += s.nextDouble();
                } else {
                    s.next();
                }
            }
        } finally {
            s.close();
        }
        System.out.println(sum);
    }
}
