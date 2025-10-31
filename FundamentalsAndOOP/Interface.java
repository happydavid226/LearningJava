interface Figure {
    static void show(){
        System.out.println("I am a figure");
    }
    void test();
}

class A implements Figure {
    A(){}
    public void show(){
        System.out.println("I am a class which implemented the figure");
    }
    public void test(){
        System.out.println("Ooops, it worked");
    }
}
public class Interface {
    public static void main(String[] args){
        A a = new A();
        a.test();
        Figure f = new A();
        f.test();
        f.show();
    }
}