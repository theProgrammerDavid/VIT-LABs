import java.io.*;
import java.util.*;

public class radius {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius");
        int x = sc.nextInt();

        System.out.println("Radius is: " + String.valueOf(3.1415 * x * x));
        sc.close();
    }
}
