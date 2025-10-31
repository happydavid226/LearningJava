package interfaceLearning;
interface A {
    default void meth(){
        System.out.println("I am meth from A");
    }
}

interface B extends A{
    default void meth(){
        A.super.meth();
        System.out.println("I am meth from B");
    }
}

class C implements B {}

public class IFDiamondDemo {
    public static void main(String[] args){
        C c = new C();
        c.meth();
    }
}