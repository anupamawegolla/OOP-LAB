public class Student {
    private int studentid;
    private String studentName;
    private int mark;

    // Constructor
    public Student(int studentid, String studentName, int mark) {
        this.studentid = studentid;
        this.studentName = studentName;
        this.mark = mark;
    }

    // Getter methods
    public int getStudentid() { 
        return studentid; 
    }
    
    public String getStudentName() { 
        return studentName; 
    }
    
    public int getMark() { 
        return mark; 
    }
}