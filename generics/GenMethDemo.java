package generics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GenMethDemo {
    static <T extends Comparable<T>, U extends T> boolean isIn(T x, U[] A){
        for(int i =0 ; i < A.length; i++){
            if(x.equals(A[i]))
                return true;
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        Integer[] a = {1, 2,3 , 4, 5, 6 , 7, 8, 9, 10};
        String[] b = {"aimable", "happy", "david", "Jules", "Bolice", "Darius"};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

    }
}
