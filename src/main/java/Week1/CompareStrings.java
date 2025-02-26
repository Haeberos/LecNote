package Week1;

import static input.InputUtils.stringInput;

public class CompareStrings {

    public static void main(String[] args) {

        String college = stringInput("Which college do you attend?");

        //We dont want to use '==', because we aren't saying the strings are exactly the same
        //example.equals allows us to compare similar strings
        //equalsIgnoreCase is even better
        if (college.equalsIgnoreCase("MCTC")) {
            System.out.println("Yay, MCTC!");
        } else {
            System.out.println("Too bad, you should go to MCTC!");
        }

    }
}
