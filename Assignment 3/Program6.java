import java.util.*;

class Passport {
    private String passportNo, issueDate, expiryDate;

    Passport(String passportNo, String issueDate, String expiryDate) {
        this.passportNo = passportNo; this.issueDate = issueDate; this.expiryDate = expiryDate;
    }

    public String toString() {
        return "Passport: " + passportNo + " Issue: " + issueDate + " Expiry: " + expiryDate;
    }
}

class Citizen {
    private String name, dob, address;
    private Passport passport;

    Citizen(String name, String dob, String address) {
        this.name = name; this.dob = dob; this.address = address;
    }
    void setPassport(Passport passport) { this.passport = passport; }

    public String toString() {
        return "Citizen: " + name + " DOB: " + dob + " Address: " + address + "\n" + passport;
    }
}

public class Q15_PassportCitizen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] c = sc.nextLine().split(",", 3);
        String[] p = sc.nextLine().split(",", 3);

        Citizen citizen = new Citizen(c[0].trim(), c[1].trim(), c[2].trim());
        citizen.setPassport(new Passport(p[0].trim(), p[1].trim(), p[2].trim()));
        System.out.println(citizen);
    }
}
