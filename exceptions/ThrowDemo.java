package exceptions;

public class ThrowDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("Inside ThrownOne");
        throw new IllegalAccessException("demo");
    }
    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("caught " + e);
        }
    }
}