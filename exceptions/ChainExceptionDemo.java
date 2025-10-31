package exceptions;

public class ChainExceptionDemo {
    public static void main(String[] args) {
        Throwable rte1 = new RuntimeException("rte1");
        Throwable rte2 = new RuntimeException("rte2");
        Throwable rte3 = new RuntimeException("rte3");
        Throwable rte4 = new RuntimeException("rte4");

        rte3.initCause(rte4);
        rte2.initCause(rte3);
        rte1.initCause(rte2);

        Throwable rte5 = rte1;
        System.out.println("before :  " + rte5);

        while(rte5.getCause() != null && rte5.getCause().getCause() != null){
            rte5 = rte5.getCause();
        }
        System.out.println("after :  " + rte5.getCause());
    }
}
