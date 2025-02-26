package Week2;

import static input.InputUtils.stringInput;

public class ForLoops {
    public static void main(String[] args) {

        // Print numbers 1-5
        for (int x = 0; x < 5; x++) {
            System.out.println(x+1);
        }

        // I decided to test this for potential debugging
        stringInput();

        // Print 10, 9, 8...
        for (int x = 10; x >= 0; x--) {
            System.out.println(x + "...");
        }
        System.out.println("Rocket has been launched!");

    }
}
