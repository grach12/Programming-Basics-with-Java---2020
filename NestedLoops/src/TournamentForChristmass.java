import java.util.Scanner;

public class TournamentForChristmass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt (scan.nextLine ());
        boolean win     = false;
        boolean winT    = false;
        double  money   = 0;
        for (int i = 1; i <= days; i++) {
            String event = scan.nextLine ();
            double daymMoney = 0.0;
            while (!event.equals ("Finish")) {
                String result = scan.nextLine ();
                if (result.equals ("win")) {
                    win = true;
                    daymMoney += 20;
                } else if (result.equals ("lose")) {
                    win = false;
                } else if (result.equals ("Finish")) {
                    break;
                }
            }
            if (win) {
                money += daymMoney * 1.1;
                winT = true;
            } else {
                money += daymMoney;
                winT = false;
            }
        }
        if (!winT) {
            System.out.printf ("You lost the tournament! Total raised money: %.2f",money);
        } else {
            System.out.printf ("You won the tournament! Total raised money: %.2f",money * 1.2);
        }
    }
}