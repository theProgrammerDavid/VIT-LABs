import java.util.*;

public class area {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int x = sc.nextInt();

        System.out.println("Area is: "+ String.valueOf(0.25*x*x*1.73205080757));;
        sc.close();
    }
}