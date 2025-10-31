package exceptions;

public class FinallyDemo {
    public static void procA(){
        try {
            System.out.println("inside Proc A");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("finally A");
        }
    }

    public static void procB(){
        try {
            System.out.println("inside Proc B ");
            return;
        } finally {
            System.out.println("finally B");
        }
    }

    public static void procC(){
        try {
            System.out.println("inside proc C");
        } finally {
            System.out.println("finally C");
        }
    }

    public static void main(String[] args){
        try {
            procA();
        } catch(Exception e){
            System.out.println("exception " + e);
        }
        procB();
        procC();
    }
}