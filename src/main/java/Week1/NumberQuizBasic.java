package Week1;

import static input.InputUtils.intInput;

public class NumberQuizBasic {
    public static void main(String[] args) {
        int secretNumber = 11;
        int guess = intInput("What number am I thinking of?");

        if (guess == secretNumber) {
            System.out.println("You guessed correctly!");
        }

        System.out.println("The end!");
    }
}
