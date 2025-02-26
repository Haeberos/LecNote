package Week1;

import static input.InputUtils.positiveDoubleInput;

public class MilesToMCTC {
    public static void main(String[] args) {
        double miles = positiveDoubleInput("How many miles to MCTC? ");
        double km = miles * 1.6;
        System.out.println("You are " + km + " kilometers from MCTC.");

        // Is the user more than 10 miles away?

        if (miles > 10) {
            System.out.println("You are more than 10 miles away from MCTC.");
        } else if (miles == 10) {
            System.out.println("You are roughly 10 miles away from MCTC.");
        } else {
            System.out.println("You are less than 10 miles away from MCTC.");
        }
    }
}
