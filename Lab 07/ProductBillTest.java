/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kelum
 */
public class ProductBillTest {
    public static void main(String[] args) {

        // create object
        ProductBill bill =
                new ProductBill("1500.00", "two");

        try {

            double total = bill.calculateTotal();

            System.out.println("Total Bill = " + total);

        } catch (NumberFormatException e) {

            // Exception occurs because "two" is not a valid number
            System.out.println("Error: Price and quantity must be valid numbers.");

        } finally {

            System.out.println("Product bill calculation completed.");
        }

        System.out.println("Program continues...");
    }
    
}
