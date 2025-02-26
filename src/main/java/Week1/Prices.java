package Week1;

import static input.InputUtils.*;

public class Prices {
    public static void main(String[] args) {
        String productName = stringInput("What is the name of the product?");
        double price = doubleInput("What does " + productName + " cost?");
        int quantity = intInput("How many " + productName + " to sell?");
        // doubleInput is another user utility we can use

        double totalPrice = price * quantity;

        System.out.println(quantity + " of "
                + productName + " at $"
                + price + " each costs a total of $"
                + totalPrice);

        System.out.printf("%d of %s at $%.2f each costs a total of $%.2f",
                quantity, productName, price, totalPrice * quantity);
    }
}
