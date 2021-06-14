import java.io.*;
import java.util.*;

class MobilePhone implements Serializable {
    public String ModelName;
    public String BrandName;
    public String ModelNumber;
    public double price;
    public int quantity;

    public MobilePhone(String Model, String BrandName, String ModelNum, int quantity, double price) {
        this.ModelName = Model;
        this.BrandName = BrandName;
        this.ModelName = ModelNum;
        this.quantity = quantity;
        this.price = price;
    }

}

class CustomComparator implements Comparator<MobilePhone> {
    @Override
    public int compare(MobilePhone o1, MobilePhone o2) {
        return o1.quantity < o2.quantity ? 1 : -1;
    }
}

class Handler {

    private String username;
    private String password;
    private boolean loggedIn;

    public boolean isLoggedIn() {
        return this.loggedIn;
    }

    public Handler() {
        this.username = "admin";
        this.password = "pass123";
        this.loggedIn = false;
    }

    public void login(String uname, String pass) throws Exception {
        try {

            if (uname.compareTo(this.username) == 0 && pass.compareTo(this.password) == 0) {
                this.loggedIn = true;
            } else {
                throw new Exception("Invalid login credentials");
            }

        } finally {

        }
    }

    synchronized public void viewPhones() throws Exception {
        try {
            Scanner sc = new Scanner(System.in);
            ArrayList<MobilePhone> objectsList = new ArrayList<>();
            FileInputStream fis = new FileInputStream("mobilephones.txt");
            int c = 0;
            boolean cont = true;
            try (ObjectInputStream input = new ObjectInputStream(fis)) {
                while (cont) {
                    c++;
                    MobilePhone m = (MobilePhone) input.readObject();
                    if (m != null) {
                        objectsList.add(m);
                    } else {
                        cont = false;
                    }
                }
            } catch (Exception e) {

            }

            System.out.println(c);

            System.out.println("Enter brand name to search for: ");
            String sname = sc.next();

            for (int i = 0; i < c - 1; i++) {
                MobilePhone m = objectsList.get(i);
                if (m.BrandName.compareTo(sname) == 0) {
                    System.out.println(
                            m.BrandName + " " + m.ModelName + " " + m.ModelNumber + " " + m.price + " " + m.quantity);
                }
            }

            System.out.println("Enter upper and lower price limit: ");
            int low = sc.nextInt();
            int up = sc.nextInt();

            for (int i = 0; i < c - 1; i++) {
                MobilePhone m = objectsList.get(i);
                if (m.price > low && m.price < up) {
                    System.out.println(
                            m.BrandName + " " + m.ModelName + " " + m.ModelNumber + " " + m.price + " " + m.quantity);
                }
            }
            Collections.sort(objectsList, new CustomComparator());
            for (int i = 0; i < c - 1; i++) {
                MobilePhone m = objectsList.get(i);
                if (m.price < 10000) {
                    System.out.println(
                            m.BrandName + " " + m.ModelName + " " + m.ModelNumber + " " + m.price + " " + m.quantity);
                }
            }

            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addPhones() {
        try (Scanner sc = new Scanner(System.in);
                FileOutputStream fos = new FileOutputStream("mobilephones.txt", true);
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            // sc.nextLine();
            System.out.println("Enter number of phones: ");
            int n = sc.nextInt();
            MobilePhone phones[] = new MobilePhone[n];
            for (int i = 0; i < n; i++) {
                System.out.println("\nEnter model name: ");
                String model = sc.next();
                System.out.println("Enter model number: ");
                String modelNum = sc.next();

                System.out.println("Enter brand name: ");
                String brandName = sc.next();

                System.out.println("Enter price: ");
                double price = sc.nextDouble();

                System.out.println("Enter quantity: ");
                int quantity = sc.nextInt();

                System.out.printf("%s %s %s %f %d", model, modelNum, brandName, price, quantity);

                phones[i] = new MobilePhone(model, brandName, modelNum, quantity, price);
                oos.writeObject(phones[i]);
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // sc.close();
        }
    }
}

public class q1 {
    public static void main(String[] args) {

        Handler h = new Handler();
        int exit = 0;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("\n1. Login\n2. Add phones\n3. View phones");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Enter username and pass");
                    h.login(sc.next(), sc.next());

                case 2:
                if(h.isLoggedIn())
                    h.addPhones();

                case 3:
                if(h.isLoggedIn())
                    h.viewPhones();
                    break;
                default:
                    System.out.println("Invalid Input");
                    exit = 1;
                    break;
            }

        } catch (Exception e) {
            System.out.println("Invalid Login credentials");
            
            return;
        }

    }
}
