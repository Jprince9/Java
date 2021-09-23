import java.lang.Math;
import java.text.DecimalFormat;
import java.text.NumberFormat;
/*
program used to calculate the root of a function using newton's method
1. input f(x)/f'(x)
2. set tolerance to the accuracy required
*/

public class Newtons {
    //functions from question 1.
    public static double af(double x){
    return (Math.pow(x,3)+2*x+2) / (3*Math.pow(x,2)+2); //f(x)/f'(x)
    }
    public static double bf(double x){
    return (Math.exp(x)+x-7) / (Math.exp(x)+1); //f(x)/f'(x)
    }
    public static double cf(double x){
    return (Math.exp(x)+Math.sin(x)-4) / (Math.cos(x)+Math.exp(x)); //f(x)/f'(x)
    }
    
    static double tolerance = .000001; //if difference between xi+1 and xi is less than 6 decimals stop
        public static void main(String[] args) throws Exception {
            NumberFormat decimal = new DecimalFormat("0.000000000000"); //formats all exponents to decimals
            int iter = 0;
            double x = 0; //initial guess
            double a = af(x); //calcs f(x)/f'(x) for the initial guess
            double b = bf(x); //calcs f(x)/f'(x) for the initial guess
            double c = cf(x); //calcs f(x)/f'(x) for the initial guess

            System.out.println("1.a)");
            while (Math.abs(a)>=tolerance) {
                a = af(x);
                x = x - a;
                iter = iter + 1;
            }
            System.out.printf("the root of a) = " + decimal.format(x) + "\n");
            System.err.print("difference between xi+1 and xi = " + decimal.format(a) + "\n");
            System.out.printf("number of iterations " + iter +"\n");

            iter = 1;
            System.out.println("1.b)");
            while (Math.abs(b)>=tolerance) {
                b = bf(x);
                x = x - b;
                iter = iter + 1;
            }
            System.out.printf("the root of b) = " + decimal.format(x) + "\n");
            System.err.print("difference between xi+1 and xi = " + decimal.format(b) + "\n");
            System.out.printf("number of iterations " + iter +"\n");

            iter =1;
            System.out.println("1.c)");
            while (Math.abs(c)>=tolerance) {
                c = cf(x);
                x = x - c;
                iter = iter + 1;
            }
            System.out.printf("the root of c) = " + decimal.format(x) + "\n");
            System.err.print("difference between xi+1 and xi = " + decimal.format(c) + "\n");
            System.out.printf("number of iterations " + iter +"\n");

    }
}
