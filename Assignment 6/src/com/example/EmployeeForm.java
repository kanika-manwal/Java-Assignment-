package com.example;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class EmployeeForm extends JFrame {
    private final JTextField idField = new JTextField();
    private final JTextField nameField = new JTextField();
    private final JTextField departmentField = new JTextField();
    private final JTextField salaryField = new JTextField();

    private final DefaultTableModel tableModel = new DefaultTableModel(
        new String[] {"Employee ID", "Name", "Department", "Salary"}, 0
    ) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    private final JTable employeeTable = new JTable(tableModel);
    private EmployeeDAO dao;

    public EmployeeForm() {
        setTitle("Employee Management");
        setSize(750, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        try {
            dao = new EmployeeDAO();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this,
                "MySQL JDBC driver not found. Add Connector/J to the classpath.",
                "Driver Error", JOptionPane.ERROR_MESSAGE);
        }

        JPanel formPanel = new JPanel(new GridLayout(4, 2, 8, 8));
        formPanel.add(new JLabel("Employee ID:"));
        formPanel.add(idField);
        formPanel.add(new JLabel("Name:"));
        formPanel.add(nameField);
        formPanel.add(new JLabel("Department:"));
        formPanel.add(departmentField);
        formPanel.add(new JLabel("Salary:"));
        formPanel.add(salaryField);

        JButton submitButton = new JButton("Submit");
        JButton viewButton = new JButton("View All Employees");

        submitButton.addActionListener(e -> addEmployee());
        viewButton.addActionListener(e -> loadEmployees());

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(submitButton);
        buttonPanel.add(viewButton);

        JPanel topPanel = new JPanel(new BorderLayout(8, 8));
        topPanel.add(formPanel, BorderLayout.CENTER);
        topPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(topPanel, BorderLayout.NORTH);
        add(new JScrollPane(employeeTable), BorderLayout.CENTER);
    }

    private void addEmployee() {
        if (dao == null) return;

        try {
            int id = Integer.parseInt(idField.getText().trim());
            String name = nameField.getText().trim();
            String department = departmentField.getText().trim();
            BigDecimal salary = new BigDecimal(salaryField.getText().trim());

            if (name.isEmpty() || department.isEmpty() || salary.signum() < 0) {
                throw new IllegalArgumentException("Enter valid employee details. Salary cannot be negative.");
            }

            dao.addEmployee(id, name, department, salary);
            JOptionPane.showMessageDialog(this, "Employee added successfully!");
            idField.setText("");
            nameField.setText("");
            departmentField.setText("");
            salaryField.setText("");
            loadEmployees();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                "Employee ID must be an integer and salary must be a decimal number.",
                "Invalid Input", JOptionPane.WARNING_MESSAGE);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),
                "Invalid Input", JOptionPane.WARNING_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(),
                "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void loadEmployees() {
        if (dao == null) return;

        tableModel.setRowCount(0);
        try (Connection con = dao.openConnection();
             ResultSet rs = dao.getAllEmployees(con)) {

            while (rs.next()) {
                tableModel.addRow(new Object[] {
                    rs.getInt("emp_id"),
                    rs.getString("name"),
                    rs.getString("department"),
                    rs.getBigDecimal("salary")
                });
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(),
                "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EmployeeForm().setVisible(true));
    }
}
