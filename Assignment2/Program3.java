import java.util.Scanner;

abstract class Shape {
    abstract double area();
    abstract double perimeter();
}

class Circle extends Shape {
    private double radius;
    Circle(double radius) { this.radius = radius; }
    double area() { return Math.PI * radius * radius; }
    double perimeter() { return 2 * Math.PI * radius; }
}

class Rectangle extends Shape {
    private double length, width;
    Rectangle(double length, double width) {
        this.length = length; this.width = width;
    }
    double area() { return length * width; }
    double perimeter() { return 2 * (length + width); }
}

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String type = sc.nextLine().trim();
            if (type.isEmpty()) continue;

            if (type.equalsIgnoreCase("circle")) {
                double r = Double.parseDouble(sc.nextLine().trim());
                Circle c = new Circle(r);
                System.out.printf("Circle Area: %.2f%n", c.area());
                System.out.printf("Circle Perimeter: %.2f%n", c.perimeter());
            } else if (type.equalsIgnoreCase("rectangle")) {
                String[] p = sc.nextLine().trim().split("\\s+");
                Rectangle r = new Rectangle(Double.parseDouble(p[0]), Double.parseDouble(p[1]));
                System.out.println("Rectangle Area: " + r.area());
                System.out.println("Rectangle Perimeter: " + r.perimeter());
            }
        }
    }
}
