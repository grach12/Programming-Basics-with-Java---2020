import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String destination = "";
        String house = "";

        if ((budget <= 100) && (season.equals("summer"))) {
            budget *= 0.3;
            destination = "Bulgaria";
            house = "Camp";
            //System.out.println(budget);
        } else if ((budget <= 100) && (season.equals("winter"))) {
            budget *= 0.7;
            destination = "Bulgaria";
            house = "Hotel";
        } else if ((budget <= 1000) && (season.equals("summer"))) {
            budget *= 0.4;
            destination = "Balkans";
            house = "Camp";
        } else if ((budget <= 1000) && (season.equals("winter"))) {
            budget *= 0.8;
            destination = "Balkans";
            house = "Hotel";
        } else if (budget > 1000) {
            budget *= 0.9;
            destination = "Europe";
            house = "Hotel";
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", house, budget);


    }
}
