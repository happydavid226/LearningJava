package annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnn {
    String str();
    int val();
}

class Meta {
    int x;
    @MyAnn(str = "static method in meta", val =  101)
    public static void myMeth(){
        System.out.println("This is a static method in Meta");
    }

    public static void another() {
        System.out.println("Not annotated method");
    }

    @MyAnn(str = "This has more than one parameters", val = 102)
    public void meth(String s, int t){
        System.out.println(s + " " + t);
    }
}

public class Annotations1 {
    public static void main(String[] args){
        Meta ob = new Meta();
        Class<?> c = ob.getClass();
        try {
            Method m = c.getMethod("myMeth");
            MyAnn ann = m.getAnnotation(MyAnn.class);
            System.out.println(ann.str() + " " + ann.val());

            m = c.getMethod("meth", String.class, int.class);
            ann = m.getAnnotation(MyAnn.class);
            System.out.println(ann.str() + " " + ann.val());

            m = c.getMethod("another");
            ann = m.getAnnotation(MyAnn.class); //here annotation is null since the method has no annotations
            System.out.println(ann.str() + " " + ann.val());

        } catch(NoSuchMethodException e){
            System.out.println("Method is not found : " + e.getMessage());
        } catch(NullPointerException e){
            System.out.println("The annotation is null : " + e.getMessage());
        }
    }
}