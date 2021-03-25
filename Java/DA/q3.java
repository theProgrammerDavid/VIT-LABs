import java.io.*;

public class q3
{
    public static void main(String args[])
    {
        int i;
        
        try(FileInputStream inputFile = new FileInputStream("in.txt")) {
            
            do {
                i = inputFile.read();
                
                if(i != -1)
                    System.out.print((char) i);
                    
            } while(i != -1);
            
        } catch(FileNotFoundException e) {
            System.out.println("The File Is Not Found..!!");
            
        } catch(IOException e) {
            System.out.println("Error reading the file ");
            
        }
        
    }
}