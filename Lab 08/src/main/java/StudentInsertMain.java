public class StudentInsertMain {
    public static void main(String[] args) {
        
        // 1. Create one Student object 
        Student newStudent = new Student(1, "Anupama", 85);
        
        // 2. Create one StudentDAO object
        StudentDAO dao = new StudentDAO();
        
        // 3. Call addStudent(...)
        dao.addStudent(newStudent);
    }
}