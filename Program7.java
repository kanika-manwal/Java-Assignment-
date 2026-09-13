import java.util.Scanner;

class Animal {
    String type = "Mammal";
}

class Mammal extends Animal {
    protected String breed;
    Mammal(String breed) { this.breed = breed; }
}

class Dog extends Mammal {
    private String name;
    Dog(String name, String breed) {
        super(breed);
        this.name = name;
    }

    void display() {
        System.out.println("Dog Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Animal Type: " + type);
    }
}

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dog d = new Dog(sc.next(), sc.next());
        d.display();
    }
}
