import java.util.*;

public class transpose {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter matrix : ");
        int a[][] = new int[n][n];
        int b[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    b[i][j] = a[j][i];
                }
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}