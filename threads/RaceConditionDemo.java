package threads;


class Caller implements Runnable {
    String message;
    CallMe target;
    Thread t;
    public Caller(CallMe callMeOb, String msg){
        t = new Thread(this);
        this.message = msg;
        this.target = callMeOb;
        t.start();
    }
    public void run(){
        synchronized(target){
            target.call(message);
        }
    }
}

public class RaceConditionDemo {
    public static void main(String[] args){
        CallMe target = new CallMe();
        Caller caller1 = new Caller(target, "Hello");
        //target.call("Hahahahahahha");
        Caller caller2 = new Caller(target, "Hey");
        Caller caller3 = new Caller(target, "Hi");


        try {
            caller1.t.join();
            caller2.t.join();
            caller3.t.join();
        } catch(InterruptedException ie){
            System.out.println("caught " + ie.getMessage());
        }
    }
}
