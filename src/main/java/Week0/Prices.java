package Week0;

public class Prices {
    public static void main(String[] args) {
        String productName = "Packet of Spaghetti";
        double price = 1.60;
        int quantity = 6;

        double totalPrice = price * quantity;
        System.out.println(quantity
                + " of "
                + productName
                + " at $"
                + price
                + " each costs a total of $"
                + totalPrice);

        // String formatting for 2 decimal places on the price
        System.out.printf("%d of %s at $%.2f each costs a total of $%.2f",
                quantity,
                productName,
                price,
                totalPrice);

    }
}
