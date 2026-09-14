import java.util.*;

abstract class Loan {
    protected double principal, time;
    Loan(double principal, double time) { this.principal = principal; this.time = time; }
    abstract double calculateInterest();
}

class HomeLoan extends Loan {
    HomeLoan(double p, double t) { super(p, t); }
    double calculateInterest() { return principal * 8 * time / 100; }
}

class CarLoan extends Loan {
    CarLoan(double p, double t) { super(p, t); }
    double calculateInterest() { return principal * 10 * time / 100; }
}

public class Q8_LoanManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;
            String[] x = line.split(",");
            Loan l = x[0].trim().equalsIgnoreCase("Home")
                    ? new HomeLoan(Double.parseDouble(x[1].trim()), Double.parseDouble(x[2].trim()))
                    : new CarLoan(Double.parseDouble(x[1].trim()), Double.parseDouble(x[2].trim()));
            String type = x[0].trim().equalsIgnoreCase("Home") ? "Home" : "Car";
            System.out.println(type + " Loan Interest: " + l.calculateInterest());
        }
    }
}
