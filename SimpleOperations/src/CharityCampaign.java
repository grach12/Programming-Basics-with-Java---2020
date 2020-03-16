import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int bakers = Integer.parseInt(scan.nextLine());
        int cakes = Integer.parseInt(scan.nextLine());
        int gofree = Integer.parseInt(scan.nextLine());
        int pancakes = Integer.parseInt(scan.nextLine());

        double cakeProfit = cakes*45;
        double gofreeProfit = gofree*5.80;
        double paneckProfit = pancakes*3.2;

        double sumProfit = (cakeProfit+gofreeProfit+paneckProfit)*bakers;
        double sumCampain = sumProfit*days;

        double taxes = sumCampain-sumCampain/8;

        System.out.printf("%.2f",taxes);


    }
}
