import java.util.Scanner;

class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    private String empId;
    private double salary;

    Employee(String name, int age, String empId, double salary) {
        super(name, age);
        this.empId = empId;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }
}

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee(sc.next(), sc.nextInt(), sc.next(), sc.nextDouble());
        e.display();
    }
}
