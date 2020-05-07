import java.util.Scanner;

public class BeePopulatinByDiagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int year = Integer.parseInt(scan.nextLine());

        for (int currentYear = 1; currentYear <= year; currentYear++) {

            n += (n / 10 * 2);

            if (currentYear % 5 == 0) {
                n -= (n / 50 * 5);
            }
            n -= (n / 20 * 2);
        }

        System.out.printf("Beehive population: %d", n);
    }
}
