import java.util.Scanner;

public class CruizeGames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String player = scan.nextLine();
        int sets = Integer.parseInt(scan.nextLine());
        double endpoints;

        double volleyCount = 0;
        double tennisCount = 0;
        double badmintonCount = 0;

        double volleyPoints = 0;
        double tennisPoints = 0;
        double badmintonPoints = 0;

        boolean win = false;

        for (int i = 0; i < sets; i++) {
            String gameType = scan.nextLine();
            double points = Double.parseDouble(scan.nextLine());

            if ("volleyball".equals(gameType)) {
                volleyPoints += points * 1.07;
                volleyCount++;
            }
            if ("tennis".equals(gameType)) {
                tennisPoints += points * 1.05;
                tennisCount++;
            }
            if ("badminton".equals(gameType)) {
                badmintonPoints += points * 1.02;
                badmintonCount++;
            }
            if ((volleyPoints / volleyCount) >= 75 && (tennisPoints / tennisCount) >= 75 && (badmintonPoints / badmintonCount >= 75)) {
                win = true;
            }

        }
        endpoints = Math.floor(volleyPoints + tennisPoints + badmintonPoints);

        if (win) {
            System.out.printf("Congratulations, %s! You won the cruise games with %.0f points.", player, endpoints);
        } else {
            System.out.printf("Sorry, %s, you lost. Your points are only %.0f.", player, endpoints);
        }

    }
}
