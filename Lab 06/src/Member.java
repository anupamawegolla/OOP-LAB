public class Member {
    private String memberName;
    private String membershipType;
    private boolean newsletterSelected;
    private int numberOfMonths;

    // Constructor
    public Member(String memberName, String membershipType, boolean newsletterSelected, int numberOfMonths) {
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.newsletterSelected = newsletterSelected;
        this.numberOfMonths = numberOfMonths;
    }

    // Getter methods
    public String getMemberName() { return memberName; }
    public String getMembershipType() { return membershipType; }
    public boolean isNewsletterSelected() { return newsletterSelected; }
    public int getNumberOfMonths() { return numberOfMonths; }

    // Method to get the monthly fee based on type
    public double getMonthlyFee() {
        if (membershipType.equals("Premium")) {
            return 2500.0;
        } else {
            return 1000.0; // Regular fee
        }
    }

    // Method to return "Yes" or "No" for the newsletter
    public String getNewsletterText() {
        return newsletterSelected ? "Yes" : "No";
    }

    // Method to calculate the total fee
    public double getMembershipFee() {
        double totalFee = getMonthlyFee() * numberOfMonths;
        if (newsletterSelected) {
            totalFee += 200.0; // Add flat newsletter charge
        }
        return totalFee;
    }
}