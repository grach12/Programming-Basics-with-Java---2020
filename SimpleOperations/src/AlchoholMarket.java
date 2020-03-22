import java.util.Scanner;

public class AlchoholMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double priceWhiskey = Double.parseDouble(scan.nextLine());
        double litersBeer = Double.parseDouble(scan.nextLine());
        double litersWhine = Double.parseDouble(scan.nextLine());
        double litersRakia = Double.parseDouble(scan.nextLine());
        double litersWhiskey = Double.parseDouble(scan.nextLine());

        double rakiaPrice = priceWhiskey/2;
        double whinePrice = rakiaPrice*0.6;
        double berPrice = rakiaPrice*0.2;

        double sumRakia = rakiaPrice*litersRakia;
        double sumWhine = whinePrice*litersWhine;
        double sumBeer = berPrice*litersBeer;
        double sumWhiskey = priceWhiskey*litersWhiskey;

        double total = sumBeer+sumRakia+sumWhine+sumWhiskey;
        System.out.printf("%.2f",total);

    }
}
