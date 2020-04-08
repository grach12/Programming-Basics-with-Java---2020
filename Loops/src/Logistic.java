import java.util.Scanner;

public class Logistic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double bus = 0;
        double truck = 0;
        double train = 0;

        double priceBus = 0;
        double priceTruck = 0;
        double priceTrain = 0;

        double allWeight = 0;
        double averagePrice = 0;

        for (int i = 0; i < n; i++) {
            double weight = Double.parseDouble(scan.nextLine());
            allWeight = weight + allWeight;

            if (weight <= 3) {
                bus = bus + weight;
                priceBus = weight * 200;
            } else if (weight > 3) {
                truck = truck + weight;
                priceTruck = weight * 175;
            } else if (weight >= 12) {
                train = train + weight;
                priceTrain = weight * 120;

            }
        }

        averagePrice = (priceBus + priceTruck + priceTrain) / allWeight;

        double percenBus = priceBus / allWeight * 100;
        double percenTruck = priceTruck / allWeight * 100;
        double percenTrain = priceTrain / allWeight * 100;


        System.out.println(averagePrice);
        System.out.printf("%.2f %% %n", percenBus);
        System.out.printf("%.2f %% %n", percenTruck);
        System.out.printf("%.2f %%", percenTrain);
    }
}