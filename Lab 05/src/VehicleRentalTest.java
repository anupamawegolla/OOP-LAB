public class VehicleRentalTest {

    public static void main(String[] args) {

        Vehicle car = new Car(
                "CAR101",
                "Toyota",
                5,
                3000.0);

        
        Vehicle bike = new Bike(
                "BIKE201",
                "Honda",
                8,
                250.0);

        System.out.println("===== Car Details =====");
        car.displayVehicleInfo();
        System.out.println("Rental Cost: Rs. "
                + car.calculateRentalCost());

        System.out.println();

        System.out.println("===== Bike Details =====");
        bike.displayVehicleInfo();
        System.out.println("Rental Cost: Rs. "
                + bike.calculateRentalCost());
    }
}