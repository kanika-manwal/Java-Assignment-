import java.util.Scanner;

interface Playable {
    void play();
}

class Guitar implements Playable {
    public void play() {
        System.out.println("Playing Guitar...");
    }
}

class Piano implements Playable {
    public void play() {
        System.out.println("Playing Piano...");
    }
}

public class Program15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String type = sc.nextLine().trim();
            if (type.isEmpty()) continue;

            Playable p = type.equalsIgnoreCase("guitar") ? new Guitar() : new Piano();
            p.play();
        }
    }
}
