package threads;

public class  CallMe {
    public void  call (String message){
        System.out.print("[" + message);
        try {
            Thread.sleep(1000);
        } catch(InterruptedException ie){
            System.out.println("caught ie exception " + ie.getMessage());
        }
        System.out.println("] closed " + message);
    }
}