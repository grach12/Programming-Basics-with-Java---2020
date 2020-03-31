import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();

        String place = "";
        String location = "";

        if ((budget <= 1000) && (season.equals("Summer"))) {
            budget *= 0.65;
            place = "Camp";
            location = "Alaska";
        } else if ((budget <= 1000) && (season.equals("Winter"))) {
            budget *= 0.45;
            place = "Camp";
            location = "Morocco";
        } else if ((budget > 1000) && (budget <= 3000) && (season.equals("Summer"))) {
            budget *= 0.8;
            place = "Hut";
            location = "Alaska";
        } else if ((budget > 1000) && (budget <= 3000) && (season.equals("Winter"))) {
            budget *= 0.6;
            place = "Hut";
            location = "Morocco";
        } else if ((budget > 3000) && (season.equals("Summer"))) {
            budget *= 0.9;
            place = "Hotel";
            location = "Alaska";
        } else if ((budget > 3000) && (season.equals("Winter"))) {
            budget *= 0.9;
            place = "Hotel";
            location = "Morocco";
        }

        System.out.printf("%s - %s - %.2f", location, place, budget);
    }
}
