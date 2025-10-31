package exception;
public class Exception {
    public static void main(String[] args){
        System.out.println("Exception");

        try {
            int a = 5;
            int b = 0;
            int c = a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e){}
        finally {
        System.out.println("finally without catch");
       }
       
        System.out.println("Exception");
        System.out.println("Java continues");
    

        /* Person pa = new Person();
        Employee pr = new Employee();
        Person pa2 = new Employee();
        pr.display();
        pa.display();
        pa3.display();
        pa.doSomething(); */

    }
}