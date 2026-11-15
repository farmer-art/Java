import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Q5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Registration");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2, 10, 10));

        JTextField idField = new JTextField();
        JTextField nameField = new JTextField();
        JTextField courseField = new JTextField();
        JButton insertBtn = new JButton("Insert");

        frame.add(new JLabel("Student ID:"));
        frame.add(idField);
        frame.add(new JLabel("Name:"));
        frame.add(nameField);
        frame.add(new JLabel("Course:"));
        frame.add(courseField);
        frame.add(new JLabel());
        frame.add(insertBtn);

        insertBtn.addActionListener(e -> {
            String sql = "INSERT INTO students (student_id, name, course) VALUES (?, ?, ?)";
            try (Connection conn = DriverManager.getConnection(
                     "jdbc:mysql://localhost:3306/your_db", "root", "password");
                 PreparedStatement stmt = conn.prepareStatement(sql)) {

                stmt.setString(1, idField.getText());
                stmt.setString(2, nameField.getText());
                stmt.setString(3, courseField.getText());
                stmt.executeUpdate();

                JOptionPane.showMessageDialog(frame, "Record inserted successfully!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage(),
                                              "Database Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        frame.setVisible(true);
    }
}   
