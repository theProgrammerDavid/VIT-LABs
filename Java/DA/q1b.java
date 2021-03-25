
import java.io.*;

public class q1b {
    public static void main(String[] args) throws IOException {
        int c;

        FileReader fileIn = null;
        try {
            fileIn = new FileReader("in.txt");
        } catch (FileNotFoundException e) {
            System.out.println("selected file is not found");
        }

        while ((c = fileIn.read()) != -1)
            System.out.print((char) c);
        fileIn.close();
    }
}