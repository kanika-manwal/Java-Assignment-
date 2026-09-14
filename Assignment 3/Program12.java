import java.util.*;

class Author {
    private String name, email, gender;

    Author(String name, String email, String gender) {
        this.name = name; this.email = email; this.gender = gender;
    }
    public String toString() {
        return name + " (" + gender + "), Email: " + email;
    }
}

class Book {
    private String title;
    private double price;
    private Author author;

    Book(String title, double price, Author author) {
        this.title = title; this.price = price; this.author = author;
    }
    public String toString() {
        return "Book: " + title + "\nPrice: " + price + "\nAuthor: " + author;
    }
}

public class Q6_LibraryBookAuthor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] x = sc.nextLine().split(",", 5);
        Author a = new Author(x[2].trim(), x[3].trim(), x[4].trim());
        System.out.println(new Book(x[0].trim(), Double.parseDouble(x[1].trim()), a));
    }
}
