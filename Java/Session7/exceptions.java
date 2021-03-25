import java.util.*;
import java.io.*;
import java.lang.NullPointerException;

public class exceptions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        try {
            int x = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException handled");
        }

        try {
            int x = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException handled");
        } finally {
            sc.close();
        }

        try {
           int arr[] = null;
           arr[2] = 2;
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }

        try {
            int arr[] = new int[4];
            arr[5] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }
    }
}