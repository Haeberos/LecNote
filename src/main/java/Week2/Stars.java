package Week2;

public class Stars {
    public static void main(String[] args) {

        // Display square of *
        int size = 5;

        // The outer loop prints one row per loop request
        for (int x = 0; x < size; x++) {

            // Inner for loop. For each row, print a star 5 times
            for (int y = 0; y < size; y++) {
                // Notice system.out.print - without println. This doesnt add a new line
                System.out.print("*");
            }

            // NOW move to the next line
            System.out.println();
        }

    }
}
