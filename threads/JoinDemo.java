package threads;

import java.util.Random;

public class JoinDemo {
    public static void main(String[] args){
        Random rand = new Random();
        Thread1[] myThreads= new Thread1[10];
        for(int i = 0; i < myThreads.length; i++){
            int r = rand.nextInt(100);
            myThreads[i] = new Thread1(r*(i+1), ("Thread"+(i+1)));
        }
        for(int i = 0; i < myThreads.length; i++){
            System.out.println(myThreads[i].t.getName() + " " + myThreads[i].t.isAlive());
        }
        try {
            for(int i = 0; i < myThreads.length; i++){
                myThreads[i].t.join();
            }
        } catch(InterruptedException e){
            System.out.println(Thread.currentThread().getName() + e.getMessage() + " Thread caught");
        }
        finally {
            System.out.println("finally");
        }
        for(int i = 0; i < myThreads.length; i++){
            System.out.println(myThreads[i].t.getName() + " " + myThreads[i].t.isAlive());
        }
        System.out.println("end");
    }
}
