import java.util.Scanner;

class Base {
    Base() {
        System.out.println("Base Constructor Called");
    }
}

class Derived extends Base {
    Derived() {
        super();
        System.out.println("Derived Constructor Called");
    }
}

public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("create derived")) {
                new Derived();
            }
        }
    }
}
