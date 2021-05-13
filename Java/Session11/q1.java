
class calculator {
    String name;
    int num1;
    int num2;

    public calculator(String name, int num1, int num2) {
        this.name = name;
        this.num1 = num1;
        this.num2 = num2;
    }

    public void add() {
        System.out.println(num1 + num2);
    }

    public void divide() {
        System.out.println(num1 / num2);
    }

    public void display_namelength() {
        System.out.println(name.length());
    }

    public static void main(String[] args) {
        calculator c = new calculator("david", 10, 0);
        try {
            c.add();
            c.display_namelength();
            c.divide();
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0");
        }
    }
}
