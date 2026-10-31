import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();

        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);

        v.remove(2);

        System.out.println("Updated Vector: " + v);
    }
}