import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double priceSkumria = Double.parseDouble(scan.nextLine());
        double priceCaca = Double.parseDouble(scan.nextLine());
        double kgPalamud = Double.parseDouble(scan.nextLine());
        double kgSafrid =  Double.parseDouble(scan.nextLine());
        double kgMidi =    Double.parseDouble(scan.nextLine());

        double pricePalamud = priceSkumria*1.6;
        double prceSafrid = priceCaca*1.8;
        double priceMidi = 7.50;

        double totalPrice = pricePalamud*kgPalamud+priceMidi*kgMidi+prceSafrid*kgSafrid;

        System.out.printf("%.2f",totalPrice);




    }
}
