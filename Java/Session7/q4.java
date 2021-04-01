import java.io.*;
import java.util.*;

class CustomException extends Exception {
    static final long serialVersionUID = 0;

    CustomException(String s) {
        super(s);
    }
}

abstract class shape {
    abstract double computeArea();
}

abstract class TwoDimensionalShape extends shape {
    abstract void getLocation(int x, int y);
}

abstract class ThreeDimensionalShae extends shape {
    abstract void getLocation(int x, int y, int z);
}

class Circle extends TwoDimensionalShape {
    public int radius;
    public double area;
    int x, y;

    public Circle(int rad) {
        area = 0;
        x = y = 0;
        this.radius = rad;
    }

    public double computeArea() {
        area = Math.PI * radius * radius;
        return area;
    }

    public void getLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Square extends TwoDimensionalShape {
    public int l, b;
    public double area;
    int x, y;

    public Square(int l, int b) {
        area = 0;
        x = y = 0;
        this.l = l;
        this.b = b;
    }

    public double computeArea() {
        area = Math.PI * l * b;
        return area;

    }

    public void getLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Sphere extends ThreeDimensionalShae {
    public int radius;
    public double area;
    int x, y, z;

    public Sphere(int rad) {
        x = y = z = 0;
        radius = rad;
        area = 0;

    }

    public void getLocation(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double computeArea() {
        this.area = 4 * Math.PI * radius * radius;
        return area;

    }
}

class Cube extends ThreeDimensionalShae {
    public int side;
    public double area;
    public int x, y, z;

    public Cube(int side) {
        x = y = z = 0;
        this.side = side;
        area = 0;

    }

    public void getLocation(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double computeArea() {
        this.area = 6 * side * side;
        return area;

    }
}

public class q4 {
    public static void main(String args[]) {
        shape shapes[] = new shape[4];
        Scanner sc = new Scanner(System.in);

        try {
            shapes[0] = new Square(5, 6);
            shapes[1] = new Circle(3);
            shapes[2] = new Cube(7);
            shapes[3] = new Sphere(3);
            for (int i = 0; i < 4; i++) {
                System.out.println(shapes[i].computeArea());
            }
            throw new CustomException("This is a custome xception");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
            sc.close();
        }
        sc.close();
    }
}
