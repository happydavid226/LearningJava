package autoboxing;

public class AutoBoxing1 {
    public static int add(Integer x){
        return x;
    }
    public static double add(Double x){
        return x;
    }
    public static void main(String[] args){
        Integer x = add(500);
        Double y = add(1000.0);
        System.out.println(x + y);
    }
}