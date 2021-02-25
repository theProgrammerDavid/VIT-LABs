import java.util.*;

public class stringFind {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean found = false;

        String arr[] = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name: ");
            String x = sc.nextLine();
            arr[i] = "Dr." + x;
        }
        System.out.print("\nEnter a name to search for: ");
        String toSearch = sc.nextLine();

        for (String s : arr) {
            if (s.substring(3).equals(toSearch)) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Name Found" : "Name Not Found");

        sc.close();
    }
}
