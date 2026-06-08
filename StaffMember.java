// StaffMember is abstract because it is used only as a parent class
// and should not be instantiated directly.

public abstract class StaffMember {

    private String fullName;
    private final String staffId;
    protected String department;

    // staffCount is static because it is shared
    // by all staff objects in the system.
    private static int staffCount = 0;

    public StaffMember(String fullName, String staffId, String department) {

        this.fullName = fullName;
        this.staffId = staffId;
        this.department = department;

        staffCount++;
    }

    public String getFullName() {
        return fullName;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getDepartment() {
        return department;
    }

    public final void displayBasicDetails() {

        System.out.println("Full Name: " + fullName);
        System.out.println("Staff ID: " + staffId);
        System.out.println("Department: " + department);
    }

    public static void showSystemName() {

        System.out.println("===== UNIVERSITY STAFF MANAGEMENT SYSTEM =====");
    }

    public static int getStaffCount() {

        return staffCount;
    }

    // changeDepartment() is useful because it allows
    // controlled updates instead of direct access.
    public void changeDepartment(String newDepartment) {

        if (!newDepartment.isEmpty()) {

            department = newDepartment;
        }
    }

    public final void showCommonNotice() {

        System.out.println("Notice: All staff members must follow university regulations.");
    }

    public abstract double calculateMonthlyPayment();
}