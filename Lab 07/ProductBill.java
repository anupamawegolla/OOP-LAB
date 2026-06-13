public class ProductBill {

    // private attributes
    private String priceText;
    private String quantityText;

    // constructor
    public ProductBill(String priceText, String quantityText) {
        this.priceText = priceText;
        this.quantityText = quantityText;
    }

    // method to calculate total bill
    public double calculateTotal() {

        double price = Double.parseDouble(priceText);

        int quantity = Integer.parseInt(quantityText);

        return price * quantity;
    }
}