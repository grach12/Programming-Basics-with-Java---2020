import java.util.Scanner;

public class TournamentForChristmass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        double totalSum = 0;
        int daysWin = 0;
        int daysLose = 0;

        for (int day = 1; day <= days; day++) {
            int countWins = 0;
            int countLoses = 0;
            double sumPerDay = 0;
            String game = scan.nextLine();
            while (!"Finish".equals(game)) {
                String result = scan.nextLine();

                if ("win".equals(result)) {
                    countWins++;
                    sumPerDay += 20;
                } else if ("lose".equals(result)) {
                    countLoses++;
                }

                game = scan.nextLine();
            }

            if (countWins > countLoses) {
                sumPerDay = sumPerDay + sumPerDay * 0.1;
                daysWin++;

            } else {
                daysLose++;
            }

            totalSum = totalSum + sumPerDay;
        }

        if (daysWin > daysLose) {
            totalSum = totalSum + totalSum * 0.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalSum);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalSum);
        }
    }
}