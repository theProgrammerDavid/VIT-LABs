import java.io.*;
import java.util.*;

public class two {
    public static void main(String args[]) {
       File file = new File("file.txt");
        try (FileReader fr = new FileReader(file)) {
           int content;
           while ((content = fr.read()) != -1) {
               System.out.print((char) content);
           }
       } catch (IOException e) {
          
       }
    }
}