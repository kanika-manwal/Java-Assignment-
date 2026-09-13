import java.util.Scanner;

class ObjectCounter {
    private static int count = 0;

    ObjectCounter() {
        count++;
    }

    static int getCount() {
        return count;
    }
}

public class Program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        if (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            String[] p = line.split("\\s+");
            for (String x : p) {
                try {
                    n = Integer.parseInt(x);
                    break;
                } catch (NumberFormatException ignored) {}
            }
        }

        for (int i = 0; i < n; i++)
            new ObjectCounter();

        System.out.println("Number of objects created: " + ObjectCounter.getCount());
    }
}
