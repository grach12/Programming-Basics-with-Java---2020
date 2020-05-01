import java.util.Scanner;

public class DartsOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startPoints = Integer.parseInt(scan.nextLine());

        int counter = 0;

        while (startPoints >= 0) {
            counter++;
            String input = scan.nextLine();
            if ("bullseye".equals(input)) {
                System.out.printf("Congratulations! You won the game with a bullseye in %d moves!", counter);
                System.exit(0);
            }

            int points = Integer.parseInt(scan.nextLine());

            if ("number section".equals(input)) {
                startPoints -= points;
            }
            if ("double ring".equals(input)) {
                startPoints -= points * 2;
            }
            if ("triple ring".equals(input)) {
                startPoints -= points * 3;
            }


            if (startPoints == 0) {
                break;
            } else if (startPoints < 0) {
                break;
            }

        }

        if (startPoints == 0) {
            System.out.printf("Congratulations! You won the game in %d moves!", counter);
        } else {
            System.out.printf("Sorry, you lost. Score difference: %d.", Math.abs(startPoints));
        }

    }
}
