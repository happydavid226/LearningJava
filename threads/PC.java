package threads;

class Q {
    int n;
    boolean valueSet = false;
    public  synchronized int get(){
        while(!valueSet){
            try {
                wait();
            } catch(InterruptedException ie){
                System.out.println("caught exception " + ie.getMessage());
            }
        }
        System.out.println("got " + n);
        valueSet = false;
        notify();
        return n;
    }

    public synchronized void put(int n){
        while(valueSet){
            try {
                wait();
            } catch(InterruptedException ie) {
                System.out.println("caught " + ie.getMessage());
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("put " + this.n);
        notify();
    }
}

class Producer implements Runnable {
    Q q;
    public Producer (Q q){
        this.q = q;
        new Thread(this, "Producer").start();
    }
    public void run(){
        int i = 0;
        while(++i <= 10){
            q.put(i);
        }
    }
}

class Consumer implements Runnable {
    Q q;
    public Consumer(Q q){
        this.q = q;
        new Thread(this, "Consumer").start();
    }
    public void run(){
        int i  = 0;
        while(++i <= 10){
            q.get();
        }
    }
}

public class PC {
    public static void main(String[] args){
        Q q = new Q();
        new Producer(q);
        for(int i = 0; i < 15; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        new Consumer(q);
        System.out.println("yeah, it is now correct");

    }
}