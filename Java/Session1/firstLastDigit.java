import java.util.*;

public class firstLastDigit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int N = sc.nextInt();
        String l = String.valueOf(N);
        System.out.println("Last digit is: " + String.valueOf(N % 10));
        System.out.println("First digit is: "+l.charAt(0));
        sc.close();
    }
}
