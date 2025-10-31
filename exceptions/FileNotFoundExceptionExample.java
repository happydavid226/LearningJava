package exceptions;
import java.io.*;
public class FileNotFoundExceptionExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myfile.txt"));
        String data = null;
        try{
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
