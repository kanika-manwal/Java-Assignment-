import java.util.Scanner;

interface Game {
    int MAX_PLAYERS = 11;

    void play();
}

class Cricket implements Game {
    public void play() {
        System.out.println("Game: Cricket, Max Players: " + MAX_PLAYERS);
    }
}

class Football implements Game {
    public void play() {
        System.out.println("Game: Football, Max Players: " + MAX_PLAYERS);
    }
}

public class Program18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String type = sc.nextLine().trim();
            if (type.isEmpty()) continue;

            Game game = type.equalsIgnoreCase("cricket") ? new Cricket() : new Football();
            game.play();
        }
    }
}
