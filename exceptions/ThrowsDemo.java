package exceptions;

public class ThrowsDemo {
    public static void throwOne() throws IllegalAccessException {
        System.out.println("I am throw one");
        throw new IllegalAccessException("demo");
    }
    public static void main(String[] args){
        try {
            throwOne();
        } catch(IllegalAccessException e) {
            System.out.println("Now we caught");
        }
    }
}