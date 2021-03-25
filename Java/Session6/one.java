import java.util.*;

class one {

    String name;
    String food;

    public one(String name, String food) {
        this.name = name;
        this.food = food;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name and food: ");
        String name = sc.next();
        String food = sc.next();
        one o = new one(name, food);

        System.out.println(o.name + " " + o.food);
        sc.close();
    }
}