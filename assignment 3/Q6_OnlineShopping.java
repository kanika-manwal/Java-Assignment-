import java.util.Scanner;

public class Q6_OnlineShopping {
    static class MinimumAmountException extends Exception {
        MinimumAmountException(String message) {
            super(message);
        }
    }

    static class OnlineShopping {
        void placeOrder(int amount) throws MinimumAmountException {
            if (amount < 500) {
                throw new MinimumAmountException("Minimum cart value must be ₹500");
            }
            System.out.println("Order placed successfully");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cart amount: ");
        int amount = sc.nextInt();

        try {
            new OnlineShopping().placeOrder(amount);
        } catch (MinimumAmountException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        sc.close();
    }
}
