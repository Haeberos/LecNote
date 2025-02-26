package Week0;

public class Temp {
    public static void main(String[] args) {
        //String and Int variables to store the date
        String currentMonth = "January";
        int dayOfMonth = 11;

        //Double variables to store the high and low temps
        double forecastHigh = 19.4;
        double forecastLow = -3.7;

        //Calculate the difference in temperatures
        double tempDifference = forecastHigh - forecastLow;

        //Print the information
        System.out.println("On "
                + currentMonth
                + " "
                + dayOfMonth
                + " the difference between the high and low temperatures is "
                + tempDifference);

        //Formatted
        System.out.printf("On %s %d the difference between the high and low temperatures is %.2f",
                currentMonth,
                dayOfMonth,
                tempDifference);
    }
}
