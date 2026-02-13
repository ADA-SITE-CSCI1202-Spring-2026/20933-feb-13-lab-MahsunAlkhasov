package week03.invoice;

public class TestInvoice {
    public static void main(String[] args) {
        invoice item = new invoice("123", "Hammer", 5, 12.5);
        System.out.println("Part Number: " + item.getPartNumber());
        System.out.println("Description: " + item.getPartDescription());
        System.out.println("Quantity: " + item.getQuantity());
        System.out.println("Price per Item: $" + item.getPricePerItem());
    }
}