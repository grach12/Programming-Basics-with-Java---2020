import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();

        String clas = "";
        String carType = "";


        if (budget > 500) {
            clas = "Luxury class";
            carType = "Jeep";
            budget *= 0.9;
        } else if ((budget > 100) && (budget <= 500)) {
            clas = "Compact class";
            if (season.equals("Summer")) {
                budget *= 0.45;
                carType = "Cabrio";
            } else if (season.equals("Winter")) {
                budget *= 0.8;
                carType = "Jeep";
            }
        } else if ((budget <= 100) && (season.equals("Summer"))) {
            budget *= 0.35;
            clas = "Economy class";
            carType = "Cabrio";
        } else if ((budget <= 100) && (season.equals("Winter"))) {
            budget *= 0.65;
            clas = "Economy class";
            carType = "Jeep";
        }

        System.out.printf("%s%n%s - %.2f", clas, carType, budget);

    }
}
