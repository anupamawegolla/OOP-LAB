public class DeliveryChargeTest {

    public static void main(String[] args) {

        DeliveryChargeCalculator calculator =
                new DeliveryChargeCalculator();

        // Base charge only
        double charge1 = calculator.calculateCharge(1000.0);

        // Base charge + distance
        double charge2 = calculator.calculateCharge(1000.0, 5.0);

        // Base charge + distance + weight
        double charge3 =
                calculator.calculateCharge(1000.0, 5.0, 10.0);

        // Express delivery
        double charge4 =
                calculator.calculateCharge(1000.0, true);

        System.out.println("Base Charge Only: Rs. " + charge1);
        System.out.println("Base + Distance Charge: Rs. " + charge2);
        System.out.println("Base + Distance + Weight Charge: Rs. " + charge3);
        System.out.println("Express Delivery Charge: Rs. " + charge4);

        // Compile-time polymorphism:
        // Java selects the correct calculateCharge method
        // based on the number and type of parameters.
    }
}
