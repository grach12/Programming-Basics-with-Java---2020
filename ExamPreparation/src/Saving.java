import java.util.Scanner;

public class Saving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double income = Double.parseDouble(scan.nextLine());
        int mounts = Integer.parseInt(scan.nextLine());

        double moneyToLive = Double.parseDouble(scan.nextLine());
        double guarantee = income*0.3;

        double untouchable = guarantee+moneyToLive;

        double save = 0;
        int counter = 0;

        for (int i = 1; i <= mounts ; i++) {
            save=income-(untouchable);
            counter++;
        }
        System.out.printf("She can save %.2f%%%n", save/income*100);
        System.out.printf("%.2f",save*counter);
        

    }
}
