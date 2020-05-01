import java.util.Scanner;

public class SummerShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        double priceTowel = Double.parseDouble(scan.nextLine());
        double discount = Double.parseDouble(scan.nextLine());

        double priceUmbrela = 2*priceTowel/3;
        double priceJapan = priceUmbrela*0.75;
        double priceSack = (priceTowel+priceJapan)/3;

        double totalSum = (priceJapan+priceTowel+priceUmbrela+priceSack)*(100-discount)/100;


if (totalSum<=budget){
    System.out.printf("Annie's sum is %.2f lv. She has %.2f lv. left.", totalSum, budget-totalSum);
}else {
    System.out.printf("Annie's sum is %.2f lv. She needs %.2f lv. more.",totalSum, totalSum-budget);
}
    }
}
