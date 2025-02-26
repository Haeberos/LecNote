package Week0;

public class PizzaRolls {
    public static void main(String[] args) {
        // Sharing Pizza Rolls between people
        double pizzarolls = 40;
        int people = 7;

        double rollsperperson = pizzarolls / people;
        System.out.println("Each person gets " + rollsperperson + " pizzarolls");
        System.out.printf("Each person gets %.1f pizza rolls", pizzarolls);
        // souf (formatted) for reduced decimal points
        // %.1f for
    }
}
