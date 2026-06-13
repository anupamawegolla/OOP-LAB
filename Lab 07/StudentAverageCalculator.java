public class StudentAverageCalculator {

    // private attributes
    private int totalMarks;
    private int numberOfStudents;

    // constructor
    public StudentAverageCalculator(int totalMarks, int numberOfStudents) {
        this.totalMarks = totalMarks;
        this.numberOfStudents = numberOfStudents;
    }

    // method to calculate average
    public int calculateAverage() {
        return totalMarks / numberOfStudents;
    }
}