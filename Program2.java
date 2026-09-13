import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String accountNumber = sc.nextLine();
        double balance = Double.parseDouble(sc.nextLine());
        BankAccount account = new BankAccount(accountNumber, balance);

        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;
            String[] parts = line.split("\\s+");
            if (parts[0].equalsIgnoreCase("deposit")) {
                account.deposit(Double.parseDouble(parts[1]));
            } else if (parts[0].equalsIgnoreCase("withdraw")) {
                account.withdraw(Double.parseDouble(parts[1]));
            } else if (parts[0].equalsIgnoreCase("checkBalance")) {
                account.checkBalance();
            }
        }
    }
}
