package Week0;

public class Address {
    public static void main(String[] args) {
        String city = "Minneappolis";
        String state = "MN";

        //Create a new string variable "Minneapolis, MN"

        String cityState = city + " " + state.toUpperCase();
        System.out.println(cityState);
    }
}
