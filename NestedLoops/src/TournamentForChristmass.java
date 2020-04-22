import java.util.Scanner;

public class TournamentForChristmass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double money = 20;

        int winMoney = 0;
        int looseMoney = 0;

        String sport = "";

        int day = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < day; i++) {
            while (!"Finish".equals(sport)) {
                sport = scan.nextLine();

                if ("win".equals(sport)) {
                    winMoney++;
                    money += money;
                } else if ("lose".equals(sport)) {
                    looseMoney++;
                }
            }
            if (winMoney > looseMoney) {
                money *= 1.1;
            }
        }
        if (winMoney > looseMoney) {
            money *= 1.2;
        }
        System.out.println(money);
    }
}
