import java.util.*;

public class roomNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter room number:");
        int number = sc.nextInt();

        switch (number) {
            case 823:
                System.out.println("Java Programming");
                break;
            case 824:
                System.out.println("Python Programming");
                break;
            default:
            System.out.println("Invalid Input");
            break;
        }
        
        sc.close();
    }
}
