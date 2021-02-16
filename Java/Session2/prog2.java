import java.util.*;

public class prog2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter NUmber: ");
            int x = sc.nextInt();

            if (x % 2 != 0) {
                sum += x;
            }
        }

        System.out.println("Sum is: "+ String.valueOf(sum));
        sc.close();

    }
}