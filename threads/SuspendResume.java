package threads;

class NewThread1 implements Runnable {
    String name;
    Thread t;
    boolean suspendFlag;

    public NewThread1(String threadName){
        this.name = threadName;
        suspendFlag = false;
        t = new Thread(this, name);
        t.start();
    }
    public void run(){
        try {
            for(int i = 15; i > 0; i--){
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this){
                    while(suspendFlag){
                        wait();
                    }
                }
            }
        } catch(InterruptedException e){
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + " exiting");
    }
    synchronized void mySuspend(){
        suspendFlag = true;
    }
    synchronized void myResume(){
        suspendFlag = false;
        notify();
    }
}

public class SuspendResume {
    public static void main(String[] args){
        NewThread1 ob1 = new NewThread1("One");
        NewThread1 ob2 = new NewThread1("two");

        try {
            Thread.sleep(1000);
            ob1.mySuspend();
            System.out.println("suspending thread one");
            Thread.sleep(1000);
            ob1.myResume();
            System.out.println("Resuming thread one");
            Thread.sleep(1000);
            ob2.mySuspend();
            System.out.println("suspending thread two");
            Thread.sleep(1000);
            ob1.myResume();
            System.out.println("Resuming thread two");
        } catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        try {
            ob1.t.join();
            ob2.t.join();
        } catch(InterruptedException e){
            System.out.println("interrupted " + Thread.currentThread().getName() + " " + e.getMessage());
        }
    }
}
