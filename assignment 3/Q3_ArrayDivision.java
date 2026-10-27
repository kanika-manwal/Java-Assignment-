import java.util.Scanner;

public class Q3_ArrayDivision {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        Scanner sc = new Scanner(System.in);

        System.out.println("Array: [10, 20, 30, 40]");
        System.out.print("Enter index: ");
        int index = sc.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        try {
            int result = numbers[index] / divisor;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero not allowed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Array index out of bounds");
        }
        sc.close();
    }
}
