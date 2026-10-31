import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();

        students.put("John", 85);
        students.put("Alice", 90);
        students.put("Bob", 78);

        String query = "Alice";

        System.out.println("Marks for " + query + ": " + students.get(query));
    }
}