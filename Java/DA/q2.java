import java.io.*;
import java.util.*;

public class q2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Source file name :");
        String a = sc.nextLine();
     
        File x = new File(a);

        System.out.println("Destination file name :");
        String b = sc.nextLine();

        File y = new File(b);
        
        FileInputStream in = new FileInputStream(x);
        FileOutputStream out = new FileOutputStream(y);

        try {

            int n;

            while ((n = in.read()) != -1) {

                out.write(n);
            }
        } finally {
            if (in != null) {

                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
        System.out.println("Successfully Copied");
        
        sc.close();
    }
}