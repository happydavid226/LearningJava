class A {
    void show(){
        System.out.println("Show from A");
    }
}

class B extends A {
    void show(){
        System.out.println("Show from B");
    }
    void superShow(){
        super.show();
    }
}

class C extends B {
    void show(){
        System.out.println("Show from C");
    }
    void superShow(){
        super.superShow();
    }
}

class D extends C {
    void show(){
        System.out.println("Show from D");
    }
    void superShow(){
        super.superShow();
    }
}

public class Ad {
    public static void main(String[] args){
        D d = new D();
        d.show();
        d.superShow();
    }
}