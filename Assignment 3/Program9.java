import java.util.*;

class Employee {
    private String name, id;
    private double basicSalary;

    Employee() {}
    Employee(String name, String id, double basicSalary) {
        this.name = name; this.id = id; this.basicSalary = basicSalary;
    }

    protected double getBasicSalary() { return basicSalary; }
    public String getName() { return name; }
    public String getId() { return id; }

    double calculateSalary() { return basicSalary; }

    public String toString() {
        return "Employee " + name + " (" + id + ") Salary: " + calculateSalary();
    }
}

class Manager extends Employee {
    private double bonus;

    Manager(String name, String id, double basicSalary, double bonus) {
        super(name, id, basicSalary);
        this.bonus = bonus;
    }

    double calculateSalary() { return getBasicSalary() + bonus; }

    public String toString() {
        return "Manager " + getName() + " (" + getId() + ") Salary: " + calculateSalary();
    }
}

public class Q3_EmployeePayroll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;
            String[] x = line.split(",");
            if (x[0].equalsIgnoreCase("Employee"))
                System.out.println(new Employee(x[1].trim(), x[2].trim(), Double.parseDouble(x[3].trim())));
            else
                System.out.println(new Manager(x[1].trim(), x[2].trim(),
                        Double.parseDouble(x[3].trim()), Double.parseDouble(x[4].trim())));
        }
    }
}
