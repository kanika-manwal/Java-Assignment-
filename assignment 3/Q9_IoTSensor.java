import java.util.Random;
import java.util.Scanner;

public class Q9_IoTSensor {
    static class SquareCalculator extends Thread {
        private final int number;
        SquareCalculator(int number) { this.number = number; }
        public void run() {
            System.out.println("Square: " + (number * number));
        }
    }

    static class CubeCalculator extends Thread {
        private final int number;
        CubeCalculator(int number) { this.number = number; }
        public void run() {
            System.out.println("Cube: " + (number * number * number));
        }
    }

    static class RandomNumberGenerator extends Thread {
        public void run() {
            Random random = new Random();
            for (int i = 0; i < 5; i++) {
                int number = random.nextInt(10) + 1;
                System.out.println("Generated: " + number);
                Thread calculator = (number % 2 == 0)
                        ? new SquareCalculator(number)
                        : new CubeCalculator(number);
                calculator.start();
                try {
                    calculator.join();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Start Simulation");
        System.out.println("2. Exit");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            new RandomNumberGenerator().start();
        } else {
            System.out.println("Exiting...");
        }
        sc.close();
    }
}
