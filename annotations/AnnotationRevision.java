package annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface AnnRev{
    String str() default "AnnRev annotation";
    int val() default 2000;
}

@Retention(RetentionPolicy.RUNTIME)
@interface AnnRev1 {
    String Description() default "There is no description";
}


@AnnRev() //use default values
class Meta3{
    @AnnRev(str = "with two parameters", val = 100)
    @AnnRev1(Description = "This is the first form")
    public static int add(int a, int b){
        return a+b;
    }

    @AnnRev(str = "with three parameters", val = 200)
    @AnnRev1(Description = "This is the second form")
    public static int add(int a, int b, int c){
        return a + b + c;
    }
    @AnnRev(str = "this is a good class variable", val = 102)
    @AnnRev1(Description = "Even variable has Annotations")
    public int classVar;

    @AnnRev(str = "constructor of class", val=1)
    @AnnRev1(Description = "this is a constructor of a class")
    public Meta3(int x){
        this.classVar = x;
    }

    @AnnRev(str="default constructor", val=500)
    @AnnRev1(Description = "this is a default constructor")
    public Meta3(){
        System.out.println("this is a default constructor");
    }

}

class Meta4 extends Meta3 {}

public class AnnotationRevision {
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException {
        Meta3 ob = new Meta3(5);
        Class<Meta3> c = Meta3.class;
        Class<?> d = ob.getClass();

        //using c
        AnnRev annMethod1 = c.getMethod("add", int.class , int.class).getAnnotation(AnnRev.class);
        AnnRev1 annMethod2 = c.getMethod("add", int.class, int.class, int.class).getAnnotation(AnnRev1.class);

        AnnRev annConstructor11 = c.getConstructor(int.class).getAnnotation(AnnRev.class);
        AnnRev annConstructor12 = c.getConstructor().getAnnotation(AnnRev.class);

        AnnRev1 annConstructor21 = c.getConstructor(int.class).getAnnotation(AnnRev1.class);
        AnnRev1 annConstructor22 = c.getConstructor().getAnnotation(AnnRev1.class);

        AnnRev annField1 = c.getField("classVar").getAnnotation(AnnRev.class);
        AnnRev1 annField2 = c.getField("classVar").getAnnotation(AnnRev1.class);

        //using d
        AnnRev dannMethod1 = d.getMethod("add", int.class , int.class).getAnnotation(AnnRev.class);
        AnnRev1 dannMethod2 = d.getMethod("add", int.class, int.class, int.class).getAnnotation(AnnRev1.class);

        AnnRev dannConstructor11 = d.getConstructor(int.class).getAnnotation(AnnRev.class);
        AnnRev dannConstructor12 = d.getConstructor().getAnnotation(AnnRev.class);

        AnnRev1 dannConstructor21 = d.getConstructor(int.class).getAnnotation(AnnRev1.class);
        AnnRev1 dannConstructor22 = d.getConstructor().getAnnotation(AnnRev1.class);

        AnnRev dannField1 = d.getField("classVar").getAnnotation(AnnRev.class);
        AnnRev1 dannField2 = d.getField("classVar").getAnnotation(AnnRev1.class);

        //printing all annotations
        System.out.println(annMethod1);
        System.out.println(annMethod2);
        System.out.println(annField1);
        System.out.println(annField2);
        System.out.println(annConstructor11);
        System.out.println(annConstructor12);
        System.out.println(annConstructor21);
        System.out.println(annConstructor22);

        System.out.println(dannMethod1);
        System.out.println(dannMethod2);
        System.out.println(dannField1);
        System.out.println(dannField2);
        System.out.println(dannConstructor11);
        System.out.println(dannConstructor12);
        System.out.println(dannConstructor21);
        System.out.println(dannConstructor22);
        System.out.println("now look at what you have done");

        //getting all annotation of a Method
        Annotation[] allAnnotations = c.getMethod("add", int.class, int.class, int.class).getAnnotations();
        for(Annotation a : allAnnotations)
            System.out.println(a);
        System.out.println("the size of a is : " + allAnnotations.length);

        //testing inheritance of annotation
        System.out.println("is annotation present : " + Meta4.class.getAnnotation(AnnRev.class));
    }
}
