import java.io.*;
import java.util.*;

class course {
    class slots {
        public void display_slots() {
            System.out.println("The slot details are given");
        }
    }
}

public class q1 {
    public static void main(String args[]) {
        int n = 5;
        int j = 5;
        Scanner sc = new Scanner(System.in);
        String s[][] = new String[n][j];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter proctor name: ");
            s[i][0] = sc.next();

            for (int k = 1; k < j; k++) {
                System.out.println("Enter student name: ");
                s[i][k] = sc.next();

            }
        }

        System.out.println("Enter proctor name: ");
        String x = sc.next();

        for (int i = 0; i < n; i++) {
            if (x == s[i][0]) {
                System.out.println(s[i][0]);

            }
        }
    }
}