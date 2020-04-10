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
        double averagePrice;

        for (int i = 0; i < n; i++) {
            double weight = Double.parseDouble(scan.nextLine());
            allWeight = weight + allWeight;

            if (weight <= 3) {
                priceBus = priceBus+weight * 200;
                bus = bus + weight;
            } else if ((weight >=4)&&(weight<=11)) {
                priceTruck = priceTruck+weight * 175;
                truck = truck + weight;
            } else if (weight >= 12) {
                priceTrain = priceTrain+weight * 120;
                train = train + weight;
            }
        }

        averagePrice = (priceBus + priceTruck + priceTrain) / allWeight;

        double percenBus =   bus*100 / allWeight;
        double percenTruck = truck*100 / allWeight;
        double percenTrain = train*100 / allWeight;


        System.out.printf("%.2f%n",averagePrice);


        System.out.printf("%.2f%%%n", percenBus);
        System.out.printf("%.2f%%%n", percenTruck);
        System.out.printf("%.2f%%", percenTrain);
    }
}