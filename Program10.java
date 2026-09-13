import java.util.Scanner;

abstract class Payment {
    protected double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract void processPayment();
}

class CreditCardPayment extends Payment {
    CreditCardPayment(double amount) { super(amount); }

    void processPayment() {
        System.out.println("Processing credit card payment of " + amount);
        System.out.println("Credit card payment successful");
    }
}

class UPIPayment extends Payment {
    UPIPayment(double amount) { super(amount); }

    void processPayment() {
        System.out.println("Processing UPI payment of " + amount);
        System.out.println("UPI payment successful");
    }
}

public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String[] p = sc.nextLine().trim().split("\\s+");
            if (p.length < 2) continue;

            double amount = Double.parseDouble(p[1]);
            Payment payment;

            if (p[0].equalsIgnoreCase("creditcard"))
                payment = new CreditCardPayment(amount);
            else
                payment = new UPIPayment(amount);

            payment.processPayment();
        }
    }
}
