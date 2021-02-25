import java.util.*;
import java.util.Arrays;

public class regno {

    static void bubbleSort(String[] arr) {
        int n = arr.length;
        String temp = "";
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1].compareTo(arr[j]) > 0) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[10];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter regno: ");
            String x = sc.nextLine();
            String sub = x.substring(2, 5);

            if (!sub.equals("BCE")) {
                System.out.println(x.subSequence(2, 5));
                System.out.println("Enter only BCE numbers");
                i--;
                continue;
            } else {
                arr[i] = x;
            }
        }

        // bubbleSort(arr);
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        sc.close();

    }
}