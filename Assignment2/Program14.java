import java.util.Scanner;

class GarbageObject {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object destroyed");
    }
}

public class Program14 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) sc.nextLine();

        GarbageObject obj = new GarbageObject();
        obj = null;

        System.gc();
        Thread.sleep(1000);
    }
}
