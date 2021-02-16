import java.util.*;

public class sort {

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter NUmber: ");
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr);

        for (int i : arr) {
          System.out.print(i);
          System.out.print(" ");
        }

        sc.close();

    }
}