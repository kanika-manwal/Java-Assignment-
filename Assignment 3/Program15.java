import java.util.*;

class Course {
    private String courseName, duration;
    Course(String courseName, String duration) {
        this.courseName = courseName; this.duration = duration;
    }
    String getCourseName() { return courseName; }
    String getDuration() { return duration; }
}

class Student {
    protected String name;
    protected Course enrolledCourse;

    Student(String name, Course course) {
        this.name = name; this.enrolledCourse = course;
    }

    public String toString() {
        return "Student: " + name + " Course: " + enrolledCourse.getCourseName() +
                " (" + enrolledCourse.getDuration() + ")";
    }
}

class PremiumStudent extends Student {
    private double discount;
    PremiumStudent(String name, Course course, double discount) {
        super(name, course); this.discount = discount;
    }
    public String toString() {
        return "Premium Student: " + name + " Course: " + enrolledCourse.getCourseName() +
                " (" + enrolledCourse.getDuration() + ") Discount: " + discount + "%";
    }
}

public class Q9_OnlineCoursePlatform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] c = sc.nextLine().split(",", 2);
        Course course = new Course(c[0].trim(), c[1].trim());

        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;
            String[] x = line.split(",");
            if (x.length == 2)
                System.out.println(new Student(x[0].trim(), course));
            else
                System.out.println(new PremiumStudent(x[0].trim(), course,
                        Double.parseDouble(x[2].trim())));
        }
    }
}
