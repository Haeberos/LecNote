package Week1;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class BloodDonor {

    public static void main(String[] args) {

        // Testing if two things are true with AND, the && operator
        // A person can be a blood donor if
        // they weigh at least 110lbs AND are 17 or over

        System.out.println("What is your weight?");
        double weight = doubleInput();

        System.out.println("How old are you?");
        int age = intInput();

        if (weight >= 110 && age >= 17) {
            System.out.println("You are eligible to be a blood donor");
        } else {
            System.out.println("Sorry, you are not eligible");
            if (weight < 110) {
                System.out.println("You do not weigh enough, you must 110lbs or more");
            }
            if (age < 17) {
                System.out.println("You are not old enough, you must be 17 years old or more");
            }
        }

    }
}