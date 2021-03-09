import java.util.*;
import java.lang.Math;

public class q3 {
    static int factorial(int n) {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }

    public static double sinh(double x) {
        double sinh = x;
        for (int i = 1; i <= 10; i++) {
            sinh += (Math.pow(x, 2 * i + 1)) / factorial(2 * i + 1);
        }

        return sinh;
    }

    public static double cosh(double x) {
        double cosh = 1;
        for (int i = 1; i <= 10; i++) {
            cosh += (Math.pow(x, 2 * i)) / factorial(2 * i);
        }

        return cosh;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (double i = 0.5; i < 5.5; i += 0.5) {
            System.out.println("sinh for " + String.valueOf(i) + "is :" + String.valueOf(sinh(i)));
            System.out.println("cosh for " + String.valueOf(i) + "is :" + String.valueOf(cosh(i)));

        }

        sc.close();
    }
}
