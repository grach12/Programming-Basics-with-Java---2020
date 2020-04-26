import java.util.Scanner;

public class VetParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int hours = Integer.parseInt(scan.nextLine());

        double ticket = 0;
        double sumDay = 0;
double sumTicket = 0 ;

        for (int i = 1; i <= days; i++) {

            for (int j = 1; j <= hours; j++) {

                if ((j % 2 != 0) && (i % 2 == 0)) {
                    ticket = 1.25;
                } else if ((j % 2 == 0) && (i % 2 != 0)) {
                    ticket = 2.50;
                } else {
                    ticket = 1;
                }
                sumDay += ticket;

            }
           // sumTicket = ticket;
            System.out.println("SumDay " + sumDay);
        }

        System.out.println("SumTotal " + sumDay);

    }
}
