import java.util.*;

abstract class Team {
    protected String name;
    protected int matchesPlayed, wins, draws;

    Team(String name, int matchesPlayed, int wins, int draws) {
        this.name = name; this.matchesPlayed = matchesPlayed;
        this.wins = wins; this.draws = draws;
    }
    abstract int calculatePoints();
}

class CricketTeam extends Team {
    CricketTeam(String n, int m, int w, int d) { super(n, m, w, d); }
    int calculatePoints() { return wins * 2 + draws; }
    public String toString() { return "Team: " + name + " (Cricket) Points: " + calculatePoints(); }
}

class FootballTeam extends Team {
    FootballTeam(String n, int m, int w, int d) { super(n, m, w, d); }
    int calculatePoints() { return wins * 3 + draws; }
    public String toString() { return "Team: " + name + " (Football) Points: " + calculatePoints(); }
}

public class Q7_SportsLeague {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;
            String[] x = line.split(",");
            Team t = x[0].trim().equalsIgnoreCase("Cricket")
                    ? new CricketTeam(x[1].trim(), Integer.parseInt(x[2].trim()),
                    Integer.parseInt(x[3].trim()), Integer.parseInt(x[4].trim()))
                    : new FootballTeam(x[1].trim(), Integer.parseInt(x[2].trim()),
                    Integer.parseInt(x[3].trim()), Integer.parseInt(x[4].trim()));
            System.out.println(t);
        }
    }
}
