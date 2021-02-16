import java.util.*;

public class pattern2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+1);
            }
            System.out.print("\n");
        }

        sc.close();

    }
}