import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double mango = Double.parseDouble(scan.nextLine())*3.25;
        double zumbo = Double.parseDouble(scan.nextLine())*4;
        double roses = Double.parseDouble(scan.nextLine())*3.50;
        double cactu = Double.parseDouble(scan.nextLine())*8;
        double priceGift = Double.parseDouble(scan.nextLine());

double allFlowers = (mango+zumbo+roses+cactu)*0.95;
      //  System.out.println(allFlowers);
if (priceGift>allFlowers){
    System.out.printf("She will have to borrow %.0f leva.", Math.ceil(priceGift-allFlowers));
}

    }
}
