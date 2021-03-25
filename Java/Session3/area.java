import java.util.*;

class test {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int c1 = 0, c0 = 0;
        String x = sc.nextLine();
        for (int i = 0; i < x.length(); i++) {
          
            if (x.charAt(i) == ' ')
                continue;
            if (x.charAt(i) == '1')
                c1++;
            else if (x.charAt(i) == '0')
                c0++;
        }
        System.out.println(c0);
        System.out.println(c1);

        sc.close();
    }
}