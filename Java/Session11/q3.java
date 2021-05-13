import java.io.*;
import java.util.*;

class Faculty implements Serializable {
    String name;
    String id;
    String designation;
    String gender;

    public Faculty() {
    }

    public Faculty(String name, String designation, String id, String gender) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.gender = gender;
    }
}

class FacultyHandler {
    private boolean fileBusy = false;

    synchronized public void readFromFile() throws InterruptedException{
        ArrayList<String> names = new ArrayList<>();
        System.out.println("waiting");
        while (fileBusy)
            wait();
        try {
          
            System.out.println("finished waiting");
            FileInputStream fis = new FileInputStream("faculties.dat");

            try (ObjectInputStream input = new ObjectInputStream(fis)) {
                for (int i = 0; i < 5; i++) {
                    Faculty obj = (Faculty) input.readObject();
                    names.add(obj.name);
                    if (obj.designation.compareTo("Assistant Professor") == 0) {
                        System.out.println(obj.name);
                    }
                }
            } catch (Exception e) {

            }
        } catch (Exception e) {

        }

        Collections.sort(names.subList(0, names.size()));
        for (String i : names) {
            System.out.printf("Name is %s\n", i);
        }
    }

    synchronized public void writeToFile() {
        this.fileBusy = true;
        Scanner sc = new Scanner(System.in);
        try (FileOutputStream fos = new FileOutputStream("faculties.dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            Faculty f[] = new Faculty[5];
            for (int i = 0; i < 5; i++) {
                System.out.printf("Enter Faculty %d designation, name, id and gender: \n", i);
                String des = sc.nextLine();
                String name = sc.nextLine();
                String id = sc.nextLine();
                String g = sc.nextLine();
                f[i] = new Faculty(name, des, id, g);
                oos.writeObject(f[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        sc.close();
        this.fileBusy = false;
        notifyAll();
    }

}

public class q3 {
    public static void main(String[] args) throws InterruptedException {
        FacultyHandler fh = new FacultyHandler();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    fh.writeToFile();
                } catch (Exception e) {

                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    fh.readFromFile();
                } catch (Exception e) {

                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

    }
}