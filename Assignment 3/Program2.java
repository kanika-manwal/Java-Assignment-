import java.util.*;

class Room {
    private String roomNumber, block, type;

    Room(String roomNumber, String block, String type) {
        this.roomNumber = roomNumber; this.block = block; this.type = type;
    }
    public String toString() {
        return "Room: " + roomNumber + " " + block + " " + type;
    }
}

class HostelStudent {
    private String name, roll, course;
    private Room room;

    HostelStudent(String name, String roll, String course) {
        this.name = name; this.roll = roll; this.course = course;
    }
    public void setRoom(Room room) { this.room = room; }

    public String toString() {
        return "Student: " + name + " (" + roll + ") " + course + "\n" + room;
    }
}

public class Q11_HostelAllocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(",", 3);
        String[] r = sc.nextLine().split(",", 3);

        HostelStudent student = new HostelStudent(s[0].trim(), s[1].trim(), s[2].trim());
        student.setRoom(new Room(r[0].trim(), r[1].trim(), r[2].trim()));
        System.out.println(student);
    }
}
