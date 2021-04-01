import java.io.*;

public class Employee implements java.io.Serializable {
    public final static long serialVersionUID = 0;
    public String name;
    public String address;
    public transient int SSN;
    public int number;

    public void mailCheck() {
        System.out.println("Mailing a check to " + name + " " + address);
    }
}
