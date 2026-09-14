import java.util.*;

class Person {
    protected String name;
    protected int age;

    Person(String name, int age) { this.name = name; this.age = age; }
}

class Doctor extends Person {
    protected String specialization;

    Doctor(String name, int age, String specialization) {
        super(name, age); this.specialization = specialization;
    }
}

class Surgeon extends Doctor {
    private String surgeryType;

    Surgeon(String name, int age, String specialization, String surgeryType) {
        super(name, age, specialization); this.surgeryType = surgeryType;
    }

    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nSpecialization: " +
                specialization + "\nSurgery Type: " + surgeryType;
    }
}

public class Q5_HospitalManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] x = sc.nextLine().split(",", 4);
        System.out.println(new Surgeon(x[0].trim(), Integer.parseInt(x[1].trim()),
                x[2].trim(), x[3].trim()));
    }
}
