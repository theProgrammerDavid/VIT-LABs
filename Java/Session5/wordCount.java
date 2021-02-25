import java.util.*;

public class wordCount {

    static int countOccurences(String str, String word) {
        String a[] = str.split("\\s+");
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (word.equals(a[i]))
                count++;
        }

        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");

        String line = sc.nextLine();
        String[] arr = line.split("\\s+");

        Map<String, Integer> m = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            m.put(arr[i], countOccurences(line, arr[i]));
        }

        for (Map.Entry<String, Integer> e : m.entrySet())
            System.out.println("Word = " + e.getKey() + ", Count = " + e.getValue());
        sc.close();

    }
}