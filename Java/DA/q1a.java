
import java.io.*;

public class q1a {
    public static void main(String[] args) throws IOException {
        String str = "I am testing how to output to a file";

        FileWriter f = new FileWriter("out.txt");
        for (int i = 0; i < str.length(); i++)
            f.write(str.charAt(i));

        System.out.println("Finished writing to file ");
        f.close();
    }
}
