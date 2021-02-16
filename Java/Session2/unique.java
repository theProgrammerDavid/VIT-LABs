import java.util.*;

public class unique {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter NUmber: ");
            arr[i] = sc.nextInt();
        }

        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }

        for (int i : set) {
            System.out.print(i);
            System.out.print(" ");
        }

        sc.close();

    }
}