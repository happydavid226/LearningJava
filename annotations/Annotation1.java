package annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Annotation1 {
    @Retention(RetentionPolicy.RUNTIME)
    @interface MyAnn {
        String str();
        int val();
    }

    @MyAnn(str = "HappyDavid", val = 16)
    public static void myMethod(){
        System.out.println("I am an annotated method");
    }
    public static void main(String[] args){
        myMethod();
    }
}
