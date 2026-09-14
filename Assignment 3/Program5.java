import java.util.*;

class Account {
    private String accNo, holderName;
    private double balance;

    Account(String accNo, String holderName, double balance) {
        this.accNo = accNo; this.holderName = holderName; this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    double getBalance() { return balance; }
}

public class Q14_BankingATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        Account account = new Account("ACC001", "User", 0);
        for (int i = 0; i < n; i++) {
            String[] x = sc.nextLine().trim().split("\\s+");
            switch (x[0].toLowerCase()) {
                case "deposit": account.deposit(Double.parseDouble(x[1])); break;
                case "withdraw": account.withdraw(Double.parseDouble(x[1])); break;
                case "getbalance": System.out.println("Balance: " + account.getBalance()); break;
            }
        }
    }
}
