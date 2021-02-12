import java.util.*;

public class digitsOfNumber {

    static Boolean isPrime(int n) {
        // Corner case
        if (n <= 1)
            return false;
        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int x = sc.nextInt();
        int temp = 0;
        int even = 0;
        int odd = 0;
        int prime = 0;

        while (x > 0) {
            temp = x / 10;
            if (isPrime(temp)) {
                prime++;
            }
            if (temp % 2 == 0)
                even++;
            else
                odd++;

            x /= 10;
        }
        System.out.println("The number of even digits are: " + String.valueOf(even));
        System.out.println("The number of odd digits are: " + String.valueOf(odd));
        System.out.println("The number of prime digits are: " + String.valueOf(prime));

        sc.close();
    }
}