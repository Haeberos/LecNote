package Week1;

import java.util.Scanner;

import static input.InputUtils.*;

public class HelloUserInputs {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Lets use a utility "stringInput" we didn't have before changing the xml compilation
        // This initially shows up as an error, if we hover, java will suggest an import static seen above for InputUtils
        // This is the same utility directory we asked for in the pom.xml file
        String userName = stringInput("Please enter your name: ");
        System.out.println("Welcome " + userName);
        // The 'Question' will pause the program while using the utility

        // You can also ask for an integer rather than a string
        // PositiveIntInput acts as validation for only positive integers
        int numberOfClasses = positiveIntInput("How many classes are you taking?: ");

        // Add an if statement so the print line can reflect proper grammar
        String units = "classes";

        // Boolean data type returns new results only if 'true', in this case,
        // if the number of classes you are taking is only 1
        if (numberOfClasses == 1) {
            units = "class";
        }

        System.out.println("You are taking "
                + numberOfClasses
                + " "
                + units     // This is where we put the result from our if statement
                + " this semester.");
    }
}
