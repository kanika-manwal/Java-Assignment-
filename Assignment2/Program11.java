import java.util.Scanner;

final class FinalClass {
    final int value = 100;

    final void finalMethod() {
        // A final method cannot be overridden.
    }
}

public class Program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) sc.nextLine();

        FinalClass obj = new FinalClass();
        System.out.println("Final variable value: " + obj.value);
        System.out.println("Cannot inherit from final class");
        System.out.println("Cannot override final method");
    }
}
