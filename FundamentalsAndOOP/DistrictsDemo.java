import java.io.*;

public class DistrictsDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader inputStr = null;
        PrintWriter outputStr = null;

        try {
            inputStr = new BufferedReader(new FileReader("districts.txt"));
            outputStr = new PrintWriter("output.txt");
            String line;
            int i = 0;
            while ((line = inputStr.readLine()) != null) {
                String[] str = line.split(",");
                System.out.print("\"" + str[2] + "\",");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
