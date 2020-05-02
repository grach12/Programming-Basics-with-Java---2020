import java.util.Scanner;

public class HoneyHarvest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String flowerType = scan.nextLine();
        double f = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        if ("Spring".equals(season)) {
            switch (flowerType) {
                case "Sunflower":
                    System.out.printf("Total honey harvested: %.2f",f *= 10);
                    break;
                case "Daisy":
                    System.out.printf("Total honey harvested: %.2f",f *= 12*1.1);
                    break;
                case "Lavender":
                    System.out.printf("Total honey harvested: %.2f", f *= 12);
                    break;
                case "Mint":
                    System.out.printf("Total honey harvested: %.2f",f *= 10*1.1);
                    break;
            }
        }
        else if ("Summer".equals(season)) {
            switch (flowerType) {
                case "Sunflower":
                    System.out.printf("Total honey harvested: %.2f",f *= 8*1.1);
                    break;
                case "Daisy":
                    System.out.printf("Total honey harvested: %.2f",f *= 8*1.1);
                    break;
                case "Lavender":
                    System.out.printf("Total honey harvested: %.2f",f *= 8*1.1);
                    break;
                case "Mint":
                    System.out.printf("Total honey harvested: %.2f",f *= 12*1.1);
                    break;
            }
        }

        if ("Autumn".equals(season)) {
            switch (flowerType) {
                case "Sunflower":
                    System.out.printf("Total honey harvested: %.2f", f *= 12*0.95);
                    break;
                case "Daisy":
                    System.out.printf("Total honey harvested: %.2f",f *= 6*0.95);
                    break;
                case "Lavender":
                    System.out.printf("Total honey harvested: %.2f",f *= 6*0.95);
                    break;
                case "Mint":
                    System.out.printf("Total honey harvested: %.2f", f *= 6*0.95);
                    break;
            }
        }



    }
}
