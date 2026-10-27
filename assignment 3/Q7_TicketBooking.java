import java.util.Scanner;

public class Q7_TicketBooking {
    static class TicketBooking {
        private int availableSeats;

        TicketBooking(int availableSeats) {
            this.availableSeats = availableSeats;
        }

        public synchronized void bookSeat(String user, int seats) {
            if (seats <= availableSeats) {
                availableSeats -= seats;
                System.out.println(user + " booked " + seats + " seat(s) successfully");
            } else {
                System.out.println(user + " booking failed. Not enough seats");
            }
        }
    }

    static class User1 extends Thread {
        private final TicketBooking booking;
        private final int seats;
        User1(TicketBooking booking, int seats) {
            this.booking = booking;
            this.seats = seats;
        }
        public void run() {
            booking.bookSeat("User1", seats);
        }
    }

    static class User2 extends Thread {
        private final TicketBooking booking;
        private final int seats;
        User2(TicketBooking booking, int seats) {
            this.booking = booking;
            this.seats = seats;
        }
        public void run() {
            booking.bookSeat("User2", seats);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Available Seats: ");
        int available = sc.nextInt();
        System.out.print("User1 wants to book: ");
        int s1 = sc.nextInt();
        System.out.print("User2 wants to book: ");
        int s2 = sc.nextInt();

        TicketBooking booking = new TicketBooking(available);
        Thread user1 = new User1(booking, s1);
        Thread user2 = new User2(booking, s2);
        user1.start();
        user1.join(); // Keeps the sample output in the order shown in the assignment.
        user2.start();
        user2.join();
        sc.close();
    }
}
