package threads;

class Thread2 implements Runnable {
    Thread t;
    Thread2(){
        t = new Thread(this);
        t.start();
    }
    public void run(){
        try {
            for(int i = 0; i < 5; i++){
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.sleep(500);
            }
        } catch(InterruptedException e){
            System.out.println(Thread.currentThread().getName() + " caught");
        }
    }
}

public class TestThread {
    public static void main(String[] args){
        new Thread2();
        for(int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
