import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String season = scan.nextLine();
        String gender = scan.nextLine();
        int studentsCount = Integer.parseInt(scan.nextLine());
        int nightCount = Integer.parseInt(scan.nextLine());

        double priceNight = 0.00;

        String sport = "";

        if (season.equals("Winter") && (gender.equals("boys") || (gender.equals("girls")))) {
            priceNight = 9.6;
        } else if (season.equals("Spring") && (gender.equals("boys") || (gender.equals("girls")))) {
            priceNight = 7.20;
        } else if (season.equals("Summer") && (gender.equals("boys") || (gender.equals("girls")))) {
            priceNight = 15;
        } else if (season.equals("Winter") && (gender.equals("mixed"))) {
            priceNight = 10;
        } else if (season.equals("Spring") && (gender.equals("mixed"))) {
            priceNight = 9.50;
        } else if (season.equals("Summer") && (gender.equals("mixed"))) {
            priceNight = 20;
        }

        if (studentsCount >= 50) {
            priceNight *= 0.50;
        } else if (studentsCount >= 20) {
            priceNight *= 0.85;
        } else if (studentsCount >= 10) {
            priceNight *= 0.95;
        }

        switch (season) {
            case "Winter":
                switch (gender) {
                    case "girls":
                        sport = "Gymnastics";
                        break;
                    case "boys":
                        sport = "Judo";
                        break;
                    case "mixed":
                        sport = "Ski";
                        break;
                }
                break;
            case "Spring":
                switch (gender) {
                    case "girls":
                        sport = "Athletics";
                        break;
                    case "boys":
                        sport = "Tennis";
                        break;
                    case "mixed":
                        sport = "Cycling";
                        break;
                }
                break;
            case "Summer":
                switch (gender) {
                    case "girls":
                        sport = "Volleyball";
                        break;
                    case "boys":
                        sport = "Football";
                        break;
                    case "mixed":
                        sport = "Swimming";
                        break;
                }
                break;
        }

        System.out.printf("%s %.2f lv.", sport, priceNight * studentsCount * nightCount);
    }
}
