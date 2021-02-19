import java.util.*;

public class names {

    static void bubbleSort(String[] arr) {
        int n = arr.length;
        String temp = "";
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1].compareToIgnoreCase(arr[j]) > 0) {
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

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Name: ");
            arr[i] = sc.nextLine();
        }

        bubbleSort(arr);

        for (String i : arr) {
            System.out.print(i);
            System.out.print(" ");
        }

        sc.close();

    }
}