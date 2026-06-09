public class DeliveryChargeCalculator {

    // Method 1
    public double calculateCharge(double baseCharge) {
        return baseCharge;
    }

    // Method 2
    public double calculateCharge(double baseCharge, double distanceKm) {
        return baseCharge + (distanceKm * 100.0);
    }

    // Method 3
    public double calculateCharge(double baseCharge,
                                  double distanceKm,
                                  double weightKg) {

        return baseCharge +
               (distanceKm * 100.0) +
               (weightKg * 50.0);
    }

    // Method 4
    public double calculateCharge(double baseCharge,
                                  boolean expressDelivery) {

        if (expressDelivery) {
            return baseCharge + 500.0;
        }

        return baseCharge;
    }
}
