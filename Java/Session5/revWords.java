import java.util.*;

public class revWords {

    static String reverse(String a) {
        StringBuilder s = new StringBuilder();
        s.append(a);
        s.reverse();
        return s.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String line = sc.nextLine();
        String[] arr = line.split("\\s+");

        
        for(int i=0;i<arr.length;i++){

            arr[i]=reverse(arr[i]);
        }

        System.out.println(Arrays.toString(arr));
        sc.close();

    }
}