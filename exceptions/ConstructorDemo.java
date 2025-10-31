package exceptions;
class  A {
    int c, d;
    A(){
        c = -1;
        d = -1;
    }
    A(int a){
        c = a;
        d = -1;
    }
    A(int a, int b){
        c = a;
        d = b;
    }
}

class B extends A {}
class C extends B {}

public class ConstructorDemo {
    public static void main(String[] args){
        A c = new A(5, 6);
        System.out.println(c.c + " " + c.d);
    }
}