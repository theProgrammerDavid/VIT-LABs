import java.util.*;

public class q2 {

    final public static double minBal = 300.00;
    final public static double maintenanceFee = 15.00;
    final public static int monthlyWithdrawls = 10;
    final public static double additionalWithdrawalcharge = 5.0;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter current account balance: (0 for minimum of Rs.300)");
        double bal = sc.nextDouble();

        System.out.println("How many withdrawals have you done? :");
        int num = sc.nextInt();

        System.out.println("Your monthly charges are: ");
        double charges = 0.0;

        if (bal < minBal) {
            charges += maintenanceFee;
        }
        if (num > monthlyWithdrawls) {
            charges += (num - monthlyWithdrawls) * additionalWithdrawalcharge;
        }
        System.out.println(charges);
        sc.close();
    }
}