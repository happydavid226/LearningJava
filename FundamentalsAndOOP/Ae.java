abstract class A {
    static double PI = 3.14;
    abstract static void showIt();
}

class B extends A {
    B(){}
    void showPi(){
        System.out.println(PI);
    }
    void showIt(){
        System.out.println("Ai will win you");
    }
}

class C {
    void showPi(){
        System.out.println("I am working");
    }
}

public class Ae {
    public static void main(String[] args){
        B b = new B();
        b.showPi();
    }
}