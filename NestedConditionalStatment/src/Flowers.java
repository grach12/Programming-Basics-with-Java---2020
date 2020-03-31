import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int chrysaCount = Integer.parseInt(scan.nextLine());
        int resoCount = Integer.parseInt(scan.nextLine());
        int tulipCount = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        String holyday = scan.nextLine();

        double allflowerCount = chrysaCount + resoCount + tulipCount;
        double allflowerPrice = 0.0;

        switch (season) {
            case "Spring":
                double chrysaPrice = 2 *chrysaCount;
                double rosePrice = 4.1 *resoCount;
                double tuliPrice = 2.50*tulipCount;
                allflowerPrice = chrysaPrice + rosePrice + tuliPrice;
                if (tulipCount > 7) {
                    allflowerPrice *= 0.95;
                }
                break;
            case "Summer":
                chrysaPrice = 2 *chrysaCount;
                rosePrice = 4.1 *resoCount;
                tuliPrice = 2.50*tulipCount;
                allflowerPrice = chrysaPrice + rosePrice + tuliPrice;
                break;
            case "Autumn":
                chrysaPrice = 3.75*chrysaCount;
                rosePrice = 4.5   *resoCount;
                tuliPrice = 4.15  *tulipCount;
                allflowerPrice = chrysaPrice + rosePrice + tuliPrice;
                break;
            case "Winter":
                chrysaPrice = 3.75*chrysaCount;
                rosePrice = 4.5   *resoCount;
                tuliPrice = 4.15  *tulipCount;
                allflowerPrice = chrysaPrice + rosePrice + tuliPrice;
                if (resoCount >= 10) {
                    allflowerPrice *= 0.9;
                }
                break;
        }

        if (allflowerCount > 20) {
            allflowerPrice *= 0.8;
        }
        if (holyday.equals("Y")){
            allflowerPrice*=1.15;
        }
        System.out.printf("%.2f", (allflowerPrice+2));
    }
}
