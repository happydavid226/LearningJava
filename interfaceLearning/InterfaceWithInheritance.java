package interfaceLearning;

interface X {
    void print();
}

class D implements X {
    public void print(){
        System.out.println("Hello world");
    }
}

class  E extends D {}



public class InterfaceWithInheritance {
    public static <T extends X> void meth(T ob){
        ob.print();
    }
    public static void main(String[] args){
        E e = new E();
        meth(e);
    }
}
