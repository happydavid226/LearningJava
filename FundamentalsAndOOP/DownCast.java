class Parent {
    public void parentOnlyFunction() {
        System.out.println("parent only");
    }
}
class Child extends Parent {
    public void childOnlyFunction() {
        System.out.println("child only");
    }
}

public class DownCast {
    public static void main(String [] args){
        Parent p = new Child();
        Child r = (Child) p;
        Parent d = new Parent();

        Child c = new Child();
        
        //r.childOnlyFunction();

        System.out.println(((p instanceof Child ) ? "P is instance of child" : "P is not instance of child"));
        System.out.println(((r instanceof Child ) ? "r is instance of child" : "r is not instance of child"));
        System.out.println(((r instanceof Parent ) ? "r is instance of Parent" : "r is not instance of Parent"));
        System.out.println(((c instanceof Parent ) ? "c is instance of Parent" : "c is not instance of Parent"));
        System.out.println(((p instanceof Parent ) ? "P is instance of parent" : "P is not instance of parent"));
        System.out.println(((d instanceof Child ) ? "d is instance of child" : "d is not instance of child"));
        System.out.println(((p instanceof Child ) ? "P is instance of child" : "P is not instance of child"));

    }
}