public class Lab04Main {

    public static void main(String[] args) {

        StaffMember.showSystemName();

        System.out.println();

        UniversityPolicy.showPolicyHeader();

        System.out.println("University Name: "
                + UniversityPolicy.UNIVERSITY_NAME);

        System.out.println();

        Lecturer lecturer1 = new Lecturer(
                "Nimal Perera",
                "L001",
                "Computing",
                3,
                50000
        );

        Lecturer lecturer2 = new Lecturer(
                "Saman Kumara",
                "L002",
                "Engineering",
                2,
                45000
        );

        LabAssistant assistant1 = new LabAssistant(
                "Kamal Silva",
                "A001",
                "Computer Lab",
                120,
                800
        );

        lecturer2.changeDepartment("Software Engineering");

        double payment1 = lecturer1.calculateMonthlyPayment();
        double payment2 = lecturer2.calculateMonthlyPayment();
        double payment3 = assistant1.calculateMonthlyPayment();

        double totalPayment = payment1 + payment2 + payment3;

        System.out.println("===== Lecturer 1 Details =====");

        lecturer1.displayLecturerDetails();

        System.out.println("Monthly Payment: " + payment1);

        lecturer1.showCommonNotice();

        System.out.println();

        System.out.println("===== Lecturer 2 Details =====");

        lecturer2.displayLecturerDetails();

        System.out.println("Monthly Payment: " + payment2);

        lecturer2.showCommonNotice();

        System.out.println();

        System.out.println("===== Lab Assistant Details =====");

        assistant1.displayLabAssistantDetails();

        System.out.println("Monthly Payment: " + payment3);

        assistant1.showCommonNotice();

        System.out.println();

        System.out.println("Total Monthly Payment: "
                + totalPayment);

        System.out.println("Total Staff Objects Created: "
                + StaffMember.getStaffCount());
    }
}