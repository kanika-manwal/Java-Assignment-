import java.util.Scanner;

public class Q5_UniversityLogin {
    static void login(String username) {
        if (username == null || username.equalsIgnoreCase("null") || username.trim().isEmpty()) {
            throw new NullPointerException("Username cannot be null");
        }
        System.out.println("Login successful. Welcome " + username);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        try {
            login(username);
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        sc.close();
    }
}
