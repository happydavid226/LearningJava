package exceptions;

import java.util.Scanner;

public class checkEligibility {
    static boolean isEligible(int age) throws IdentityException {
        if(age < 16)
            throw new IdentityException("age is less than 16");
        else
            return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();

        try {
            if(isEligible(10))
                System.out.println("Go to the voting site");
        } catch(IdentityException e) {
            System.out.println(e.getMessage());
        }
    }
}
