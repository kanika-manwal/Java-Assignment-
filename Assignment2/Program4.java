import java.util.Scanner;

class Calculator {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
    int add(int a, int b, int c) { return a + b + c; }
}

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;
            String[] p = line.split("\\s+");

            if (p.length == 3) {
                if (p[1].contains(".") || p[2].contains(".")) {
                    double a = Double.parseDouble(p[1]), b = Double.parseDouble(p[2]);
                    System.out.println("Sum (double,double): " + calc.add(a, b));
                } else {
                    int a = Integer.parseInt(p[1]), b = Integer.parseInt(p[2]);
                    System.out.println("Sum (int,int): " + calc.add(a, b));
                }
            } else if (p.length == 4) {
                System.out.println("Sum (int,int,int): " +
                        calc.add(Integer.parseInt(p[1]), Integer.parseInt(p[2]), Integer.parseInt(p[3])));
            }
        }
    }
}
