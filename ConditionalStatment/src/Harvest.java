import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int areaLand = Integer.parseInt(scan.nextLine());
        double areaGrape = Double.parseDouble(scan.nextLine());
        double needLiters = Double.parseDouble(scan.nextLine());
        int workers = Integer.parseInt(scan.nextLine());

        double totalGrape = areaLand*areaGrape;
        double wine = (totalGrape*0.4/2.5);
        //System.out.println(wine);
        if (wine>=needLiters){
            double wineLeft = wine-needLiters;
            double winePerson = wineLeft/workers;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(wine));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(wineLeft), Math.ceil(winePerson));
        }
        else {
            double wineNeed = needLiters-wine;
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(wineNeed));
        }


    }
}
