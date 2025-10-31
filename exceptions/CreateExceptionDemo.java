package exceptions;

class MyException extends Exception {
    private int detail;
    MyException(int a){
        detail = a;
    }
    @Override
    public String toString(){
        return ("MyException[" + detail + "]");
    }
}

public class CreateExceptionDemo {

    public static void compute(int a) throws MyException {
        System.out.println("computing " + a);
        if(a > 10)
            throw new MyException(a);
        System.out.println("exit normally");        
    }

    public static void main(String[] args){
        try {
            compute(1);
            compute(20);
        } catch(MyException e){
            System.out.println("caught " + e);
        }
    }
}