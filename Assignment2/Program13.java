import java.util.Scanner;

class Parent {
    int value = 50;

    Parent() {
        System.out.println("Parent constructor called");
    }

    void show() {
        System.out.println("Parent method called");
    }
}

class Child extends Parent {
    Child() {
        super();
    }

    void testSuper() {
        super.show();
        System.out.println("Parent variable value: " + super.value);
    }
}

public class Program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("test super")) {
                Child c = new Child();
                c.testSuper();
            }
        }
    }
}
