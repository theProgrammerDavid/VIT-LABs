
public class q1 {

    public static double simpleInterest(double sum, int time) {
        double rate = 9.5 / 100;

        return sum * time * rate;
    }

    public static double compoundInterest(double sum, int time) {
        double rate = 9 / 100;
        return sum * Math.pow(1 + rate, time);
    }

    public static void main(String args[]) {
        System.out.println("Amount after Compund Interest is: Rs." + String.valueOf(compoundInterest(25000, 5)));

        System.out.println("Amount after Simple Interest is: Rs." + String.valueOf(simpleInterest(25000, 5)));
    }
}