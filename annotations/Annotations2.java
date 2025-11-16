package annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Annotation;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnn2 {
    String str();
    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnn3 {
    String description();
}

@MyAnn2(str = "This class is called meta", val = 100)
@MyAnn3(description = "Second annotation of class meta")
class Meta2 {

    @MyAnn2(str = "This is a test method", val = 101)
    @MyAnn3(description = "Second annotation of test method")
    public void test(){
        System.out.println("this is a test method with 2 annotations");
    }
}

public class Annotations2 {
    public static void main(String[] args){
        Meta2 ob = new Meta2();
        try {
            MyAnn2 ann = ob.getClass().getMethod("test").getAnnotation(MyAnn2.class);
        } catch(NoSuchMethodException e){
            System.out.println("The  method is not found " + e.getMessage());
        }

        Annotation[] myAnns = ob.getClass().getAnnotations();
        for(Annotation ann : myAnns){
            System.out.println(ann);
        }
    }
}
