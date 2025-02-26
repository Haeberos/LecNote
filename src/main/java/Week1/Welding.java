package Week1;

import static input.InputUtils.yesNoInput;

public class Welding {

    public static void main(String[] args) {

        // Taking Welding classes at MCTC, you must dress safely.
        // You should wear cotton or wool clothes. And, you should wear closed-toe shoes.
        // Check if a student is dressed safely for welding

        boolean cottonClothes = yesNoInput("Are you wearing cotton clothes?");
        boolean woolClothes = yesNoInput("Are you wearing wool clothes?");
        boolean closedToeShoes = yesNoInput("Are you wearing closed-toe shoes");

        // Instead of using just one pair of parentheses, nest (cottonClothes || woolClothes)
        // into one condition. Otherwise, the boolean will be true if ANY of those conditions
        // are met.

        if ( (cottonClothes || woolClothes) && closedToeShoes) {
            System.out.println("You are dressed safely for welding.");
        } else {
            System.out.println("You must wear wool or cotton clothes, and closed-toe shoes");
        }


    }

}