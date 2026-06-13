public class StudentMarkReport {

    // private array attribute
    private String[] marks;

    // constructor
    public StudentMarkReport(String[] marks) {
        this.marks = marks;
    }

    // method to get mark
    public int getMarkAt(int index) {

        // access array value
        String selectedMark = marks[index];

        // convert String into int
        int mark = Integer.parseInt(selectedMark);

        return mark;
    }
}