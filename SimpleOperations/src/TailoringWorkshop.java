import java.util.Scanner;

public class TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tables = Integer.parseInt(scan.nextLine());
        double lenght = Double.parseDouble(scan.nextLine());
        double width = Double.parseDouble(scan.nextLine());

        double totalLenght = tables*(lenght+2*0.3)*(width+2*0.3);
        double totalLenghtKAre = tables*(lenght/2)*(lenght/2);

        double priceUSD = totalLenght*7+totalLenghtKAre*9;
        double priceBgn = priceUSD*1.85;

        System.out.printf("%.2f USD%n%.2f BGN", priceUSD, priceBgn);

    }
}
