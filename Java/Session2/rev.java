import java.util.*;

public class rev {

    static void reverse(Integer a[]) {
        Collections.reverse(Arrays.asList(a));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Integer arr[] = new Integer[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter NUmber: ");
            arr[i] = sc.nextInt();
        }

       reverse(arr);

        for (int i : arr) {
            System.out.print(i);
            System.out.print(" ");
        }

        sc.close();

    }
}