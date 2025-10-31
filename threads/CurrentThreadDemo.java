package threads;

public class CurrentThreadDemo {
    public static void main(String[] args){
        Thread t = Thread.currentThread();
        System.out.println("before changing name " + t.getName());
        t.setName("David");
        System.out.println("after changing name " + t.getName());

        try {
            for(int i = 0; i < 5; i++){
                System.out.println(t + " " + (i + 1));
                Thread.sleep(1000);
            }
        } catch(InterruptedException e){
            System.out.println("Caught Interrrupted Exception");
        }
        finally {
            System.out.println("Even if you kill your self you can't escape finally");
        }
    }
}