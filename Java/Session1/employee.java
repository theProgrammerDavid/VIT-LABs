import java.util.*;

public class employee {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String MobileNumber;
        System.out.println("Enter employee mobile number");
        MobileNumber = sc.nextLine();

        switch(MobileNumber){
            case "9012345621":
            System.out.println("Kumar has bonus: "+String.valueOf(500*(14)));
            break;
            case "8143567890":
            System.out.println("Dinesh has bonus: "+String.valueOf(500*(4)));
            break;
            case "7114567213":
            System.out.println("Ganesh has bonus: "+String.valueOf(500*(10)));
            break;
            case "9098456743":
            System.out.println("Not eligible for a bonus");
            break;
            case "8159056784":
            System.out.println("Rakesh has bonus: "+String.valueOf(500*(6)));
            break;

            default:
            System.out.println("Not eligible for bonus");
            break;
        }
        sc.close();
    }
}
