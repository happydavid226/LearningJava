interface TestInterface {
    void square(int a);
    default void show(){
        System.out.println("show from TestInterface one");
    }
}

interface TestInterface1 {
    default void show(){
        System.out.println("Show from interface two");
    }
}
public class TestClass implements TestInterface, TestInterface1 {
    public void square(int a){
        System.out.println(a*a);
    }
    @Override
    public void show(){
        System.out.println("java is javing");
    }
    public static void main(String[] args){
        TestClass d = new TestClass();
        d.square(4);
        d.show();
    }
}