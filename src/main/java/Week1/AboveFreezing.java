package Week1;

import static input.InputUtils.doubleInput;

public class AboveFreezing {
    public static void main(String[] args) {
        System.out.println("Enter today's temperature in Fahrenheit: ");
        double temp = doubleInput();
        // Double data type is needed

        if (temp > 32) {
            // This will run if the condition is TRUE
            System.out.println("It's above freezing!");
        }
    }
}
