package threads;

class  MyThread extends Thread {
    MyThread(){
        super("myThread");
        System.out.println("My Thread Created");
        start();
    }
    public void run(){
        try {
            for(int i = 0; i < 5; i++){
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + "Thread caught");
        }
    }
}

public class ExtendThread {
    public static void main(String[] args){
        new MyThread();
        try {
            for(int i = 0; i < 5; i++){
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.sleep(999);
            }
        } catch(InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + "Thread caught");
        }
    }
}