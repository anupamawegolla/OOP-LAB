public class StudentSearchUpdateMain {
    public static void main(String[] args) {
        
        // 1. Create a StudentDAO object
        StudentDAO dao = new StudentDAO();
        
        System.out.println("--- Searching for Student ID 1 ---");
        // 2. Call findStudentById(1)
        dao.findStudentById(1);
        
        System.out.println("\n--- Updating Mark for Student ID 1 to 95 ---");
        // 3. Call updateStudentMark(1, 95)
        dao.updateStudentMark(1, 95);
        
        System.out.println("\n--- Verifying the Update ---");
        // 4. Call findStudentById(1) again
        dao.findStudentById(1);
        
    }
}