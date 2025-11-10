package tests;

import java.math.*;
public class Secant {
    public static void main(String[] args) {
        double x0 = Double.parseDouble(args[0]);
        double x1 = Double.parseDouble(args[1]);
        double x = 0;
        double error = 1.0E-50;
        for (int i = 2; i <= 10; i++) {
            if (Double.compare(Math.abs(x0 - x1), error) > 0) {
                x = x1 - (x1 - x0) * f(x1) / (f(x1) - f(x0));
                x0 = x1;
                x1 = x;
                System.out.println("x" + i + " = " + x);
            } else {
                break;
            }
        }
        MathContext mc = new MathContext(50);
        BigDecimal answer = new BigDecimal(x, mc);
        System.out.println("x = " + answer);
    }

    //Define the function f(x)
    public static double f(double x) {
        return Math.cos(x) - x;
    }
}
