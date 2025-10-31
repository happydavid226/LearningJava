public class Example {
    public static void main (String [] args){
        int a[] = new int[5];
        for(int i = 0; i < 5; i++){
            a[i]  = i * 5;
        }
        for(int i = 0; i < 5; i++)
            System.out.print(a[i] + " ");
    }
}