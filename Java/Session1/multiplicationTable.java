import java.io.*;
import java.util.*;

public class multiplicationTable {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(String.valueOf(n) + " x " + String.valueOf(i) + " = " + String.valueOf(n * i) + "\n");
        }
        sc.close();
    }
}
