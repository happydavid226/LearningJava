package exceptions;

public class MultiCatchDemo {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            //int c = a / b;
            int[] A = {1, 2, 3};
            //A[49] = 10;
            String name = null;
            int n = name.length();
        } catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e){
            System.out.println("we have caught an exception : " + e);
        }
    }
}
