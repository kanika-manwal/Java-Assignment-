import java.util.Scanner;

interface ShapeInterface {
    default void showShape(String shape) {
        System.out.println("Shape: " + shape);
    }

    static void staticMethod() {
        System.out.println("Static method from interface");
    }
}

class Square implements ShapeInterface {
}

class Triangle implements ShapeInterface {
}

public class Program17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String type = sc.nextLine().trim();
            if (type.isEmpty()) continue;

            ShapeInterface shape;
            if (type.equalsIgnoreCase("square")) {
                shape = new Square();
                shape.showShape("Square");
            } else if (type.equalsIgnoreCase("triangle")) {
                shape = new Triangle();
                shape.showShape("Triangle");
            }
        }

        ShapeInterface.staticMethod();
    }
}
