import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double priceVegetables = Double.parseDouble(scan.nextLine()); //BGN
        double priceFruits = Double.parseDouble(scan.nextLine()); //BGN
        int kgVegetables = Integer.parseInt(scan.nextLine());
        int kgFruit = Integer.parseInt(scan.nextLine());

        double incomeBGN = kgFruit*priceFruits+kgVegetables*priceVegetables;
        double incomeEUR = incomeBGN/1.94;

        System.out.printf("%.2f", incomeEUR);

    }
}
