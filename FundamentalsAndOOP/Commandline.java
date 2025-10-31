public class Commandline{
    public static void main(String [] args){
        int sum = 0;
        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
        System.out.println(sum);
    }
}