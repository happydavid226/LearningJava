package exceptions;

public class LabeledBreakDemo {
    public static void check1(){
        if(true) return;
        first : for(int i = 0; i < 2; i++) {
            second : for(int j = 0; j < 2; j++) {
                third : for(int k = 0; k < 2; k++) {
                    System.out.println(i + " " + j + " " + k);

                }
            }
        }
    }
    public static void check2(){
        first: {
        for(int i = 0; i < 2; i++) {
                for(int j = 0; j < 2; j++) {
                    third : {
                        for(int k = 0; k < 2; k++) {
                            System.out.println(i + " " + j + " " + k);
                            if(k==1)
                                break first;
                        }
                    }
                }

        }
        }
    }
    public static void main(String[] args) {
        check2();
    }
}
