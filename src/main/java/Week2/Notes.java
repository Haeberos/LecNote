package Week2;

public record Notes() {
    // The Logic of Java is the same as C#,Python,VB
    // The Syntax, Environment, and Support Structure are all different

    // Two types of loops
    // For Loops, for doing things a certain number of times
    // While Loops, for repeating while something is true or false
    // Must decide upon and keep track of counters for the loop, both the start and the end
    // This is the convention for a FOR LOOP:

    // TODO For (COUNTER STARTING POINT ; CONDITION FOR RUNNING ; ITERATION/COUNTER BEHAVIOR) {CODE YOU WANT TO REPEAT}
    //  EXAMPLE:
    //        for (int x = 0 ; x < 10 ; x++) {
    //            System.out.println("x = " + x);
    // You can nest loops inside each other

    // Reminder: Arrays start at position 0 (for each defined position there is a value)
    // Refer to this syntax:
    // int[] scores = new int[10]
    // Type of array, name of array, new (because we're creating a new object) and type + size
    // Can also create String[] array and double[]

    // Example:
    // int[] data = new int[3]
    // data[0] = 10;
    // data[1] = 15;
    // data[2] = 8;

    // Use the new array positions as you please:
    // system.out.println("first element = " + data[0]);
    // intSecondElement = data[1];
    // intLastElement = data[2];

    // TODO Remember: Array Numbering starts at 0
    //  AND, the last item is Arrays Size -1
    //  So, it includes the 0 position

    // TODO Add data to an array as you create it by using {}
    //  Example:
    //  String[] languages = {"Java", "Python", "c#"};
    //  Int[] numbers = {1, 2, 3};
    //        This automatically creates positions and array size

    // Use arrayname.length to measure the array's length as an int value

    // recall that we use positions to mark the start of a loop, and arrays also use positions
    // So lets make a for loop using an array
    //
    //        String[] classrooms = {"T310", "T320", "T330", "T340", "T350", "T360"};
    //
    //        for (int x = 0 ; x < 6 ; x++) {
    //            System.out.println(classrooms[x]);
    //        }
    // So, starting at the int value of x (int x = 0) where its position is 0
    // And while the value of x and its position is < 6 (x < 6),
    // iterate to the next position (x++)
    // and execute the rest of the loop
    // print(classrooms[x]) prints the contents of each position in the array

    // Java convention is to use the "final" data type to create a constant, the opposite of a variable
    // Constants cannot change, so the final data type cannot change
    // So final String, or final int, or final double

    // Use debugger for your code by hitting tbe circle on the left next to your line of code to make a break
    // Run debugging on the program
    // It will pause just before executed the indicated line
    // Use step over to progress line by line






}
