import java.io.*;
import java.util.*;

public class one {
    public static void main(String args[]) {
        Scanner s = null;
        try {
            s = new Scanner(new FileInputStream("file.txt"));
            s.useDelimiter("(?<=.)");
            while (s.hasNext()) {
                char[] arr = s.next().toCharArray();
                for(char x:arr)System.out.print(x);
            }
            s.close();

        } catch (FileNotFoundException e) {

        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}