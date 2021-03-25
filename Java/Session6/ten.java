import java.util.*;

class Employee {
    public String name, empid;

    public Address[] getAd() {
        return new Employee.Address[2];
    }

    public Employee(String name, String empid) {
        this.empid = empid;
        this.name = name;

        // this.addresses = new Employee.Address[2];

    }

    class Address {
        public String street;
        public String city;
        public String district;
        public String state;
        public String zipcode;

        public Address() {

        }

        public void displayData() {
            System.out.println(state + " " + street + " " + district + " " + zipcode + " " + city + " ");
        }
    }

    // public Address addresses[];
}

public class ten {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name and empid: ");
        String name = sc.next(), id = sc.next();

        Employee e = new Employee(name, id);
        // Employee.Address addresses = e.new Address();
        Employee.Address address[] = e.getAd();
        address[0].city = sc.next();
        // addresses.city = sc.next();

        // for (int i = 0; i < 1; i++) {
        // // e.addresses = new e
        // System.out.println("Enter City, District, State, Street, Zipcode: ");

        // addresses.city = sc.next();
        // addresses.district = sc.next();
        // addresses.state = sc.next();
        // addresses.street = sc.next();
        // addresses.zipcode = sc.next();

        // addresses.displayData();
        // }

        sc.close();
    }
}
