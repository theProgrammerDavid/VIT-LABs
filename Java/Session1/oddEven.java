import java.util.*;

public class oddEven {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int x = sc.nextInt();

        if (x % 2 != 0) {
            System.out.println("Number is odd");
        } else {
            System.out.println("Number is even");
        }
        sc.close();
    }
}