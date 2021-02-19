import java.util.*;

public class wordcount {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String x = sc.nextLine();
        System.out.println("Enter the word: ");

        String word = sc.nextLine();
        int count = 0;
        String a[] = x.split(" ");

        for (int i = 0; i < a.length; i++) {

            if (word.equals(a[i]))
                count++;
        }
        System.out.println(count);

        sc.close();
    }
}
