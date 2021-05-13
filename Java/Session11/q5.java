import java.util.*;

class Customer {
    String name;
    double purchase;

    public Customer(String name, double amount) {
        this.name = name;
        this.purchase = amount;
    }

}

public class q5 {
    public static void main(String[] args) {
        LinkedList<Customer> l = new LinkedList<Customer>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter name and purchase amount for customer %d: ", i);
            String name = sc.next();
            double p = sc.nextDouble();
            l.add(new Customer(name, p));
        }

        Iterator<Customer> iterator = l.descendingIterator();

        int count = 0;

        while (iterator.hasNext()) {
            Customer c = iterator.next();
            System.out.printf("Customer %d has name %s and purchased %f\n", count++, c.name, c.purchase);

        }

        sc.close();
    }
}