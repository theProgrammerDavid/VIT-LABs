import java.io.*;
import java.util.*;

abstract class shape {
    abstract void computeArea();
}

abstract class TwoDimensionalShape extends shape {
    abstract void getLocation(int x, int y);
}

abstract class ThreeDimensionalShae extends shape {
    abstract void getLocation(int x, int y, int z);
}

class Circle extends TwoDimensionalShape {
    int radius;
    double area;
    int x, y;

    public Circle() {
        area = 0;
        radius = x = y = 0;
    }

    public void computeArea() {
        area = Math.PI * radius * radius;
    }

    public void getLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Square extends TwoDimensionalShape {
    int l, b;
    double area;
    int x, y;

    public Square() {
        area = 0;
        l = b = x = y = 0;
    }

    public void computeArea() {
        area = Math.PI * l * b;
    }

    public void getLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class q4 {
    public static void main(String args[]) {

    }
}
