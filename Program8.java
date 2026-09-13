import java.util.Scanner;

class Vehicle {
    void start() {
        System.out.println("Vehicle starting...");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starting...");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starting...");
    }
}

public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String type = sc.nextLine().trim();
            if (type.isEmpty()) continue;

            Vehicle v;
            if (type.equalsIgnoreCase("car"))
                v = new Car();
            else
                v = new Bike();

            v.start();
        }
    }
}
