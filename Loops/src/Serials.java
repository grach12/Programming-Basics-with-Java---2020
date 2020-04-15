import java.awt.geom.Area;
import java.util.Scanner;

public class Serials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());

        double sumSeries = 0;
        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            double price = Double.parseDouble(scan.nextLine());
            if ("Thrones".equals(name)) {
                price = price / 2;
            }
            if ("Lucifer".equals(name)) {
                price = price * 0.60;
            }
            if ("Protector".equals(name)) {
                price = price * 0.7;
            }
            if ("TotalDrama".equals(name)) {
                price = price * 0.8;
            }
            if ("Area".equals(name)) {
                price = price * 0.9;
            }

            sumSeries = sumSeries + price;
        }
        //System.out.println(sumSeries);
        if (sumSeries<=budget){
            System.out.printf("You bought all the series and left with %.2f lv.", budget-sumSeries);
        }
        else {
            System.out.printf("You need %.2f lv. more to buy the series!", sumSeries-budget);
        }
    }
}
