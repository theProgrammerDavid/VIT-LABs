import java.util.*;

public class password {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter username");
        String username = sc.nextLine();

        System.out.println("Enter password");
        String pass = sc.nextLine();

        if (username.length() == 0 || pass.length() == 0) {
            System.out.println("USername or pass is empty");
            sc.close();

            return;
        }

        if (pass.length() < 8) {
            System.out.println("Password length too short");
            sc.close();

            return;

        }

        if (pass.contains(username)) {
            System.out.println("Password contains username");
            sc.close();

            return;
        }
        System.out.println("Confirm password");
        String confPass = sc.nextLine();

        if (!confPass.equals(pass)) {
            System.out.println("Passwords do not match");
            sc.close();

            return;

        }

        sc.close();
    }
}