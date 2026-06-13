/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kelum
 */
public class StudentMarkReportTest {
    public static void main(String[] args) {

        // create array
        String[] marks = {"78", "82", "absent", "90"};

        // create object
        StudentMarkReport report =
                new StudentMarkReport(marks);

        // FIRST TRY BLOCK
        try {

            // Exception occurs because index 6 does not exist
            int mark = report.getMarkAt(6);

            System.out.println("Mark = " + mark);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Error: Selected mark position does not exist.");

        } finally {

            System.out.println("Array access checking completed.");
        }

        // SECOND TRY BLOCK
        try {

            // Exception occurs because "absent" is not a valid number
            int mark = report.getMarkAt(2);

            System.out.println("Mark = " + mark);

        } catch (NumberFormatException e) {

            System.out.println("Error: Selected mark is not a valid number.");

        } finally {

            System.out.println("Number conversion checking completed.");
        }

        System.out.println("Report checking completed.");
    }
    
}
