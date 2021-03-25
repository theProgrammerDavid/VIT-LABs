import java.util.Scanner;

interface x {
    public boolean isPalindrome(int number); // interface method (does not have a body)

    public int reverse(int number); // interface method (does not have a body)
}

public class q5 implements x {
    /** Main Method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner
        q5 obj = new q5();

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Report whether the integer is a palindrome.
        System.out.println(number + (obj.isPalindrome(number) ? " is " : " is not ") + "a palindrome.");
    }

    /** Method isPalindrome returns true if number is a palindrome */
    public boolean isPalindrome(int number) {
        return number == reverse(number) ? true : false;
    }

    /** Method reverse returns the reversal of an integer */
    public int reverse(int number) {
        String reverse = ""; // Holds reversed number
        String n = number + ""; // Convert number to string
        // Reverse string
        for (int i = n.length() - 1; i >= 0; i--) {
            reverse += n.charAt(i);
        }
        return Integer.parseInt(reverse); // Return reversed integer
    }
}