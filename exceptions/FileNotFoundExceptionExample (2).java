package exception;
import java.io.*;
public class FileNotFoundExceptionExample {
   public static void main(String args[]) throws IOException {//throws IOException {
       BufferedReader br = new BufferedReader(new FileReader("myfile.txt"));
           String data = null;
           while ((data = br.readLine()) != null) {
               System.out.println(data);
           }
     
   }
}