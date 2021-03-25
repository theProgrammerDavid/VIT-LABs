import java.util.*;
import java.io.*;
import java.lang.NullPointerException;

public class exceptions1 {
    public static void main(String args[]) {

        try {
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException handled");
        }

        try {
            throw new InputMismatchException();
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException handled");
        }

        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }

        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }
    }
}