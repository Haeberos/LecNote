package Week2;

public class OilChange {

    public static void main(String[] args) {
        
        int mileage = 150000;
        int oilChangeInterval = 3000;

        for (int oilChange = 0; oilChange < 8; oilChange++) {
            mileage = mileage + oilChangeInterval;
            System.out.printf("Get oil changed at %d miles\n", mileage);
        }

    }
}