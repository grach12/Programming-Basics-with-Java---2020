import java.util.Scanner;

public class EasterCompetition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int easterBreads = Integer.parseInt(sc.nextLine());
        int maxPoints = 0;
        String winner = "";

        for (int i = 0; i < easterBreads; i++) {
            String name = sc.nextLine();
            int points = 0;


            String input = sc.nextLine();

            while (!"Stop".equals(input)) {
                int currentPoints = Integer.parseInt(input);
                points += currentPoints;
                input = sc.nextLine();
            }

            System.out.printf("%s has %d points.%n", name, points);
            if (points > maxPoints) {
                maxPoints = points;
                winner = name;
                System.out.printf("%s is the new number 1!%n", name);
            }
        }

        System.out.printf("%s won competition with %d points!", winner, maxPoints);

    }
}