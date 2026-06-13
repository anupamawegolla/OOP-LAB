import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class StudentDAO {
    
    public void addStudent(Student student) {
        // The SQL insert query with placeholders (?)
        String sql = "INSERT INTO students (student_id, student_name, mark) VALUES (?, ?, ?)";
        
        try (Connection connection = StudentDatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            
            // Map the student object's data to the ? placeholders
            statement.setInt(1, student.getStudentid());
            statement.setString(2, student.getStudentName());
            statement.setInt(3, student.getMark());
            
            // Execute the query
            statement.executeUpdate();
            System.out.println("Student added successfully.");
            
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
    public void displayAllStudents() {
        // The SQL select query to get all records
        String sql = "SELECT student_id, student_name, mark FROM students";
        
        try (Connection connection = StudentDatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             // Execute the query and store the result in a ResultSet
             ResultSet resultSet = statement.executeQuery()) {
            
            System.out.println("--- Student Records ---");
            
            // Loop through the results row by row
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("student_id") + 
                                   " | Name: " + resultSet.getString("student_name") + 
                                   " | Mark: " + resultSet.getInt("mark"));
            }
            
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
    public void findStudentById(int studentId) {
        // The SQL select query with a WHERE clause to filter by ID
        String sql = "SELECT student_id, student_name, mark FROM students WHERE student_id = ?";
        
        try (Connection connection = StudentDatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            
            // Replace the ? placeholder with the actual studentId
            statement.setInt(1, studentId);
            
            try (ResultSet resultSet = statement.executeQuery()) {
                // If a record is found, print details
                if (resultSet.next()) {
                    System.out.println("Student Found: ID: " + resultSet.getInt("student_id") + 
                                       " | Name: " + resultSet.getString("student_name") + 
                                       " | Mark: " + resultSet.getInt("mark"));
                } else {
                    // If no record is found
                    System.out.println("Student not found.");
                }
            }
            
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
    public void updateStudentMark(int studentId, int newMark) {
        // The SQL update query with two placeholders (?)
        String sql = "UPDATE students SET mark = ? WHERE student_id = ?";
        
        try (Connection connection = StudentDatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            
            // Set the new mark for the first ?, and the student ID for the second ?
            statement.setInt(1, newMark);
            statement.setInt(2, studentId);
            
            // Execute the update and check how many rows were changed
            int rowsUpdated = statement.executeUpdate();
            
            if (rowsUpdated > 0) {
                System.out.println("Student mark updated successfully.");
            } else {
                System.out.println("Student not found. Mark not updated.");
            }
            
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}