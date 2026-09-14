import java.util.*;

class Professor {
    private String name, employeeId, specialization;

    Professor() {}
    Professor(String name, String employeeId, String specialization) {
        this.name = name; this.employeeId = employeeId; this.specialization = specialization;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmployeeId() { return employeeId; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }
    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    public String toString() {
        return "Name: " + name + ", ID: " + employeeId + ", Specialization: " + specialization;
    }
}

class Department {
    private String deptName, hodName;
    private List<Professor> professors;

    Department() { professors = new ArrayList<>(); }
    Department(String deptName, String hodName) {
        this.deptName = deptName; this.hodName = hodName;
        professors = new ArrayList<>();
    }

    public String getDeptName() { return deptName; }
    public void setDeptName(String deptName) { this.deptName = deptName; }
    public String getHodName() { return hodName; }
    public void setHodName(String hodName) { this.hodName = hodName; }
    public List<Professor> getProfessors() { return professors; }
    public void setProfessors(List<Professor> professors) { this.professors = professors; }
    public void addProfessor(Professor p) { professors.add(p); }

    public String toString() {
        StringBuilder s = new StringBuilder("Department: " + deptName + "\nHOD: " + hodName + "\nProfessors:\n");
        for (Professor p : professors) s.append(p).append("\n");
        return s.toString();
    }
}

public class Q1_University {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] d = sc.nextLine().split(",", 2);
        Department dept = new Department(d[0].trim(), d[1].trim());
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            String[] p = sc.nextLine().split(",", 3);
            dept.addProfessor(new Professor(p[0].trim(), p[1].trim(), p[2].trim()));
        }
        System.out.print(dept);
    }
}
