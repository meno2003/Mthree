package Practice.Methods;

public class ShoppingCalculator {

    public static void main(String[] args) {

        double price = 20.0;
        int quantity = 3;

        double subtotal = calculateSubtotal(price, quantity);
        double tax = calculateTax(subtotal);
        double total = calculateTotal(subtotal, tax);

        printReceipt(price, quantity, subtotal, tax, total);
    }

    public static double calculateSubtotal(double price, int quantity) {
        return price * quantity;
    }

    public static double calculateTax(double s) {
        return s * 0.2; // 20% tax
    }

    public static double calculateTotal(double subtotal, double tax) {
        return subtotal + tax;
    }

    public static void printReceipt(double price, int quantity, double subtotal, double tax, double total) {
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
    }
}