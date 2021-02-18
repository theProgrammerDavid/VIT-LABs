import java.util.*;

public class identity {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                if (i == j && a[i][j] != 1) {
                    flag = false;
                    break;
                }
                if (i != j && a[i][j] != 0) {
                    flag = false;
                    break;
                }
            }
        }
        System.out.println(flag ? "Identity" : "Not Identity");
        sc.close();
    }
}