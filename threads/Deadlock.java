package threads;

class A {
    public synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered A.foo");

        try {
            Thread.sleep(1000);
        } catch(InterruptedException e){
            System.out.println("A interrupted");
        }
        System.out.println(name + " trying to call B.last()");
        b.last();
    }

    synchronized void last(){
        System.out.println("Inside A.last");
    }
}

class B {
    public synchronized void bar(A a){
        String name = Thread.currentThread().getName();
        System.out.println(name + " Entered B.bar");
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e){
            System.out.println("B interrupted");
        }
        a.last();
    }

    synchronized void last(){
        System.out.println("Inside B.last");
    }
}

public class Deadlock  implements Runnable {
    A a = new A();
    B b = new B();
    Deadlock(){
        Thread.currentThread().setName("MainThread");
        new Thread(this, "Racing Thread").start();
        a.foo(b);
        System.out.println("Back in main thread");
    }
    public void run(){
        b.bar(a);
        System.out.println("Back in another thread");
    }
    public static void main(String[] args){
        new Deadlock();
    }
}
