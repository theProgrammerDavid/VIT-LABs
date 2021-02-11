import java.io.*;
import java.util.*;

public class addNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0, cc = 1;
        int sum = 0;
        while (cc == 1) {
            System.out.print("Enter numbers a and b: ");
            a = sc.nextInt();
            b = sc.nextInt();
            sum += a + b;
            System.out.println("Do you want to continue ? y=1/n=0");
            cc = sc.nextInt();
        }
        System.out.println("Sum is: "+ String.valueOf(sum));
        sc.close();
    }
}
