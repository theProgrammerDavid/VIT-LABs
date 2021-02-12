import java.util.*;

public class revSeq {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int N = sc.nextInt();

        for (int i = N; i > 0; i--) {
            System.out.print(String.valueOf(i) + "-");
        }
        sc.close();
    }
}