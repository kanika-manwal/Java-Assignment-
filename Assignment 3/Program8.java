import java.util.*;

abstract class Flight {
    private String flightNumber, airline;
    private double fare;

    Flight(String flightNumber, String airline, double fare) {
        this.flightNumber = flightNumber; this.airline = airline; this.fare = fare;
    }
    protected double getFare() { return fare; }
    public String getFlightNumber() { return flightNumber; }
    public String getAirline() { return airline; }
    abstract double calculateFare();

    public String toString() {
        return "Flight No: " + flightNumber + " Airline: " + airline + " Fare: " + calculateFare();
    }
}

class DomesticFlight extends Flight {
    DomesticFlight(String n, String a, double f) { super(n, a, f); }
    double calculateFare() { return getFare() * 1.10; }
}

class InternationalFlight extends Flight {
    InternationalFlight(String n, String a, double f) { super(n, a, f); }
    double calculateFare() { return getFare() * 1.25; }
}

public class Q2_FlightBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;
            String[] x = line.split(",", 4);
            double fare = Double.parseDouble(x[3].trim());
            Flight f = x[0].trim().equalsIgnoreCase("Domestic")
                    ? new DomesticFlight(x[1].trim(), x[2].trim(), fare)
                    : new InternationalFlight(x[1].trim(), x[2].trim(), fare);
            System.out.println(f);
        }
    }
}
