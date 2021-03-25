import java.util.*;

interface Number {
    public static boolean isPalindrome(int number) {
        return number == reverse(number) ? true : false;
    }

    public static int reverse(int number) {
        String reverse = "";
        String n = number + "";

        for (int i = n.length() - 1; i >= 0; i--) {
            reverse += n.charAt(i);
        }
        return Integer.parseInt(reverse);
    }
}

public class q4 {

    public static void main(String[] args) {
        System.out.println("Jophn Doe, 19LOL0028, L49+50");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println(number + (Number.isPalindrome(number) ? " is " : " is not ") + "a palindrome.");
        input.close();
    }

}