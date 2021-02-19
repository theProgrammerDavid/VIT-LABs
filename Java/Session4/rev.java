import java.util.*;

public class rev {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String x = sc.nextLine();

        String rev = "";
        for (int i = x.length() - 1; i >= 0; i--) {
            rev += x.charAt(i);
        }
        System.out.println(rev);

        sc.close();
    }
}
