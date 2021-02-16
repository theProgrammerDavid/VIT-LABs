import java.util.*;

public class prog1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean found = false;

        System.out.println("Enter 5 numbers");

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter Number: ");
            int n = sc.nextInt();
            if (n != 13) {
                continue;
            } else {
                found = true;
                break;
            }
        }
        System.out.println(found ? "You are the lucky winner" : "You are unlucky");
        sc.close();

    }
}