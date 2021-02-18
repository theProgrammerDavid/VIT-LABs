import java.util.*;

public class sumRows {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int a[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum += a[i][j];

            }
            System.out.println("Sum is: " + String.valueOf(sum));
        }
        sc.close();
    }
}