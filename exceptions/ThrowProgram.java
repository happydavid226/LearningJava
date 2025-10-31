package exceptions;

public class ThrowProgram {
    public static void printStringLength() throws IllegalArgumentException {
        String name = null;
        //System.out.println(name.length());
    }
    public static void main(String[] args) {
        printStringLength();
    }
}
