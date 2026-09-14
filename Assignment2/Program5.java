import java.util.Scanner;

class Student {
    private String name;
    private int age;

    Student() {
        name = "Unknown";
        age = 0;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(Student other) {
        this.name = other.name;
        this.age = other.age;
    }

    void display(String type) {
        System.out.println(type + " Constructor: Name=" + name + ", Age=" + age);
    }
}

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();

        Student s1 = new Student();
        Student s2 = new Student(name, age);
        Student s3 = new Student(s2);

        s1.display("Default");
        s2.display("Parameterized");
        s3.display("Copy");
    }
}
