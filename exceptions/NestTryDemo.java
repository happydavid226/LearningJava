package exceptions;

public class NestTryDemo {
    public static void main(String[] args){
        try {
            int a = args.length;
            if(a == 0)
                System.out.println(42/a);
            
            try {
                if(a == 1){
                    System.out.println(a / (a-a));
                }

                if(a == 2){
                    int[] c = new int[5];
                    System.out.println(c[42]);
                }
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println( "catched in inside catch "+ e.getMessage());
            }
        } catch(ArithmeticException e){
            System.out.println("catched in outside catch " + e.getMessage());
        }
    }
}