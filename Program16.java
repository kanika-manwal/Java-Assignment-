import java.util.Scanner;

interface Readable {
    void read();
}

interface Writable {
    void write();
}

interface ReadableWritable extends Readable, Writable {
}

class Document implements ReadableWritable {
    public void read() {
        System.out.println("Reading Document...");
    }

    public void write() {
        System.out.println("Writing Document...");
    }
}

public class Program16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String[] p = sc.nextLine().trim().split("\\s+");
            if (p.length < 2) continue;

            Document d = new Document();
            if (p[1].equalsIgnoreCase("read"))
                d.read();
            else
                d.write();
        }
    }
}
