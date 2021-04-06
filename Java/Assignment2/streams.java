import java.io.*;
import java.util.*;

public class streams {
    private String data = "Sample data. xyz 123.";

    public void outputStreamFn() {
        System.out.println("inside outputStreamFn");

        try {
            OutputStream out = new FileOutputStream("output.txt");
            byte[] dataBytes = data.getBytes();

            out.write(dataBytes);
            System.out.println("Data written to file.");
            out.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }

    public void inputStreamReaderFn() {
        char[] array = new char[100];

        try {
            System.out.println("inside inputStreamReaderFn");

            FileInputStream file = new FileInputStream("input.txt");
            InputStreamReader input = new InputStreamReader(file);

            input.read(array);

            System.out.print("Data in the input stream reader is :");
            System.out.println(array);

            input.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }

    public void inputStreamFn() {
        byte[] array = new byte[100];
        System.out.println("inside inputStreamFn");

        try {
            InputStream input = new FileInputStream("input.txt");

            System.out.println("Bytes in the file are: " + input.available());
            input.read(array);
            System.out.print("Bytes read from the file are: ");

            String data = new String(array);
            System.out.println(data);
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public void fileWriterFn() {
        System.out.println("inside fileWriterFn");
        try {
            Writer output = new FileWriter("output4.txt");
            output.write(data);
            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }

    public void stringWriterFn() {
        System.out.println("inside stringWriterFn");

        try {
            StringWriter output = new StringWriter();

            output.write(data);

            System.out.println("Data in the StringWriter is: " + output);

            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }

    public void outputStreamWriterFn() {
        System.out.println("inside outputStreamWriterFn");

        try {
            FileOutputStream file = new FileOutputStream("output2.txt");

            OutputStreamWriter output = new OutputStreamWriter(file);
            output.write(data);

            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }

    public void bufReaderFn() {

        System.out.println("inside bufReaderFn");

        char[] array = new char[100];

        try {
            FileReader file = new FileReader("input.txt");

            BufferedReader input = new BufferedReader(file);

            input.read(array);
            System.out.print("Data in the file is: ");
            System.out.println(array);
            input.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }

    public void buffWriterFn() {
        System.out.println("inside buffWriterFn");

        try {
            FileWriter file = new FileWriter("output3.txt");

            BufferedWriter output = new BufferedWriter(file);
            output.write(data);

            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }

    public void fileReader() {
        System.out.println("inside fileReader");

        char[] array = new char[100];

        try {
            Reader input = new FileReader("input.txt");

            System.out.println("Data in the stream?  " + (input.ready() ? "yes" : "no"));
            input.read(array);
            System.out.print("Data in the stream: ");
            System.out.println(array);

            input.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }

    public void stringReaderFn() {
        System.out.println("inside stringReaderFn");

        char[] array = new char[100];

        try {
            StringReader input = new StringReader(data);

            input.read(array);
            System.out.print("Data read from the string is:");
            System.out.println(array);

            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public static void main(String args[]) {

        streams s = new streams();
        s.inputStreamFn();
        s.outputStreamFn();
        s.fileWriterFn();
        s.stringWriterFn();
        s.buffWriterFn();
        s.outputStreamWriterFn();
        s.fileReader();
        s.bufReaderFn();
        s.inputStreamReaderFn();
        s.stringReaderFn();
    }
}