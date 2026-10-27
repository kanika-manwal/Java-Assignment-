public class Q10_BankTransaction {
    static class BankTransaction extends Thread {
        private final int amount;
        private final boolean highValue;

        BankTransaction(String name, int amount, boolean highValue) {
            super(name);
            this.amount = amount;
            this.highValue = highValue;
            setPriority(highValue ? Thread.MAX_PRIORITY : Thread.MIN_PRIORITY);
        }

        public void run() {
            if (highValue) {
                System.out.println("High-value transaction processed first: ₹" + amount);
            } else {
                System.out.println("Low-value transaction processed later: ₹" + amount);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        BankTransaction low = new BankTransaction("Transaction1", 5000, false);
        BankTransaction high = new BankTransaction("Transaction2", 50000, true);

        high.start();
        high.join(); // Makes the example's output order predictable.
        low.start();
        low.join();
    }
}
