import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int budget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int fisherman = Integer.parseInt(scan.nextLine());

        double price = 0;

        switch (season) {
            case "Spring":
                price = 3000;
                break;
            case "Summer":
            case "Autumn":
                price = 4200;
                break;
            case "Winter":
                price = 2600;
                break;
        }
        if (fisherman % 2 == 0 && !season.equals("Autumn")) {
            price = price * 0.95;
        }

        if (fisherman <= 6) {
            price *= 0.90;
        } else if ((fisherman > 7) && (fisherman < 12)) {
            price *= 0.85;
        } else if (fisherman >= 12) {
            price *= 0.75;
        }

        if (price > budget) {
            double moneyNeed = price - budget;
            System.out.printf("Not enough money! You need %.2f leva.", moneyNeed);
        } else {
            double moneyLeft = budget - price;
            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
        }
    }
}
