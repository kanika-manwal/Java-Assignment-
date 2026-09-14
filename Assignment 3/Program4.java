import java.util.*;

class Guest {
    private String name, idProof;
    private int age;

    Guest(String name, int age, String idProof) {
        this.name = name; this.age = age; this.idProof = idProof;
    }
    public String toString() { return name + "," + age + "," + idProof; }
}

class Reservation {
    private String reservationId, roomType;
    private List<Guest> guests = new ArrayList<>();

    Reservation(String id, String roomType) {
        this.reservationId = id; this.roomType = roomType;
    }
    void addGuest(Guest g) { guests.add(g); }

    public String toString() {
        StringBuilder s = new StringBuilder("Reservation ID: " + reservationId +
                " Room: " + roomType + "\nGuests:\n");
        for (Guest g : guests) s.append(g).append("\n");
        return s.toString().trim();
    }
}

public class Q13_HotelReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] h = sc.nextLine().split(",");
        Reservation r = new Reservation(h[0].trim(), h[1].trim());
        int n = Integer.parseInt(h[2].trim());
        for (int i = 0; i < n; i++) {
            String[] g = sc.nextLine().split(",");
            r.addGuest(new Guest(g[0].trim(), Integer.parseInt(g[1].trim()), g[2].trim()));
        }
        System.out.println(r);
    }
}
