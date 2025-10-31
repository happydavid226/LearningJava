package threads;

import java.util.Random;

class Thread1 implements Runnable {
    int sleepingTime;
    Thread t;
    Thread1(int sleepingTime, String Name){
        t = new Thread(this, Name);
        this.sleepingTime = sleepingTime;
        t.start();
    }
    @Override
    public void run(){
        try {
            for(int i = 0; i < 5; i++){
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.sleep(sleepingTime);
            }
        } catch(InterruptedException e){
            System.out.println(Thread.currentThread().getName() + "Thread caught");
        }
    }
}
public class ManyThreadsDemo {
    public static void main(String[] args) {
        Random rand = new Random();
        for(int i = 0; i < 10; i++){
            int r = rand.nextInt(1000);
            new Thread1(r*(i+1), ("thread " + i) );
        }
        try {
            Thread.sleep(100001);
        } catch(InterruptedException e){
            System.out.println(Thread.currentThread().getName() + "Thread caught");
        }
        finally{
            System.out.println("Main thread ended");
        }
    }
}
