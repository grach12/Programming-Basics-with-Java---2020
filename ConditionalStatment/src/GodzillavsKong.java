import java.util.Scanner;

public class GodzillavsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int countArtist = Integer.parseInt(scan.nextLine());
        double priceCloth = Double.parseDouble(scan.nextLine())*countArtist;

        double priceDecor = budget*0.1;


        if (countArtist>150){
            priceCloth=priceCloth*0.9;
        }
       // System.out.println(priceCloth);
        if ((priceDecor+priceCloth)>budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", (priceDecor+priceCloth) - budget);
        }
        else if((priceDecor+priceCloth)<=budget){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget-(priceDecor+priceCloth));
        }

    }
}
