import java.util.Scanner;

class Book {
    private String title, author;
    private double price;

    void setDetails(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b1 = new Book();
        Book b2 = new Book();

        b1.setDetails(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
        b2.setDetails(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));

        b1.displayDetails();
        b2.displayDetails();
    }
}
