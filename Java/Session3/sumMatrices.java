import java.util.*;

public class sumMatrices {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter matrix A: ");
        int a[][] = new int[n][n];
        int b[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter matrix B: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = a[i][j] + b[i][j];
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
        }

        sc.close();
    }
}