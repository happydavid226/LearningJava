package threads;

class NewThread implements Runnable {
    Thread t;

    NewThread(){
        t = new Thread(this, "MyThread");
        t.start();
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e){
            System.out.println(Thread.currentThread().getName() + " caught");
        }
        System.out.println("MyThread created");
    }
    @Override
    public void run(){
        try {
            for(int i = 0; i < 5; i++){
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " caught ");
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args){
        new NewThread();
        try {
            for(int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.sleep(999);
            }
        } catch(InterruptedException e){
            System.out.println(Thread.currentThread().getName() + " caught");
        }
    }
}
