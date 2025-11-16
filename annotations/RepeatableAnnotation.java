package annotations;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface MyAnn4{
    String value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos{
    MyAnn4[] value();
}

public class RepeatableAnnotation {
    @MyAnn4("Repeatable1")
    @MyAnn4("Repeatable2")
    public static void meth(String s, int x) throws NoSuchMethodException {
        System.out.println(s + " " + x);

        System.out.println(RepeatableAnnotation.class.getMethod("meth", String.class, int.class).getAnnotation(MyRepeatedAnnos.class));
    }
    public static void main(String[] args) throws NoSuchMethodException {
        meth("Hello", 5);
        System.out.println(RepeatableAnnotation.class.getMethod("meth", String.class, int.class).getAnnotation(MyRepeatedAnnos.class));

        MyAnn4[] myAnnotations = RepeatableAnnotation.class.getMethod("meth", String.class, int.class).getAnnotationsByType(MyAnn4.class);
        for(MyAnn4 x : myAnnotations)
            System.out.println(x);
    }
}
