package com.example;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDAO {
    // Change these values to match your local MySQL setup.
    private static final String URL =
        "jdbc:mysql://localhost:3306/company_db?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "kanika@26";

    public EmployeeDAO() throws ClassNotFoundException {
        // Optional with modern JDBC drivers, but included for clarity.
        Class.forName("com.mysql.cj.jdbc.Driver");
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public void addEmployee(int id, String name, String department,
                            BigDecimal salary) throws SQLException {
        String sql = "INSERT INTO employees (emp_id, name, department, salary) VALUES (?, ?, ?, ?)";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, department);
            ps.setBigDecimal(4, salary);
            ps.executeUpdate();
        }
    }

    public ResultSet getAllEmployees(Connection con) throws SQLException {
        Statement statement = con.createStatement();
        return statement.executeQuery(
            "SELECT emp_id, name, department, salary FROM employees ORDER BY emp_id"
        );
    }

    public Connection openConnection() throws SQLException {
        return getConnection();
    }
}
