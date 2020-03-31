import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String season = scan.nextLine();
        int distance = Integer.parseInt(scan.nextLine());

        double salary = 0.0;

        switch (season) {
            case "Spring":
            case "Autumn":
                if (distance <= 5000) {
                    salary = distance * 0.75;
                } else if (distance <= 10000) {
                    salary = distance * 0.95;
                } else if (distance <= 20000) {
                    salary = distance * 1.45;
                }
                break;
            case "Summer":
                if (distance <= 5000) {
                    salary = distance * 0.9;
                } else if (distance <= 10000) {
                    salary = distance * 1.1;
                } else if (distance <= 20000) {
                    salary = distance * 1.45;
                }
                break;
            case "Winter":
                if (distance <= 5000) {
                    salary = distance * 1.05;
                } else if (distance <= 10000) {
                    salary = distance * 1.25;
                } else if (distance <= 20000) {
                    salary = distance * 1.45;
                }
                break;

        }

        System.out.printf("%.2f", salary * 4 * 0.9);

    }
}