// A final class should not be inherited because
// its behavior and rules should not be changed.

public final class UniversityPolicy {

    public static final String UNIVERSITY_NAME =
            "ABC University";

    public static final double BONUS_RATE = 0.10;

    public static void showPolicyHeader() {

        System.out.println("===== UNIVERSITY POLICY =====");
    }

    public static double calculateBonus(double monthlyPayment) {

        return monthlyPayment * BONUS_RATE;
    }
}