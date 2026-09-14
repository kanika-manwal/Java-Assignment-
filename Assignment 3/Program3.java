import java.util.*;

class Vehicle {
    protected String regNo, brand;
    protected double baseRate;

    Vehicle(String regNo, String brand, double baseRate) {
        this.regNo = regNo; this.brand = brand; this.baseRate = baseRate;
    }
    double calculateRent() { return baseRate; }
}

class Car extends Vehicle {
    Car(String r, String b, double rate) { super(r, b, rate); }
    double calculateRent() { return baseRate * 1.5; }
}

class Bike extends Vehicle {
    Bike(String r, String b, double rate) { super(r, b, rate); }
    double calculateRent() { return baseRate * 1.2; }
}

public class Q12_VehicleRental {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;
            String[] x = line.split(",");
            Vehicle v = x[0].trim().equalsIgnoreCase("Car")
                    ? new Car(x[1].trim(), x[2].trim(), Double.parseDouble(x[3].trim()))
                    : new Bike(x[1].trim(), x[2].trim(), Double.parseDouble(x[3].trim()));
            System.out.println(x[0].trim() + " " + v.regNo + " " + v.brand +
                    " Rent: " + v.calculateRent());
        }
    }
}
