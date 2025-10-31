package iostreams;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        int a = scn.nextInt();
        System.out.println("Enter Second number : ");
        int b = scn.nextInt();
        System.out.println("Sum : " + (a+b));
        scn.close();
    }
}
