public class First {
    static int factorial(int n){
        if(n < 2) return 1;
        return factorial(n-1) * n;
    }
    public static void main(String[] args){
        System.out.println(factorial(5));
    }
}