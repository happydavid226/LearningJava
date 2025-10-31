class A {
    static int a = 5;
}

class B extends A {}

public class Test {
    public static void main(String[] args){
        System.out.println(B.a);
    }
}