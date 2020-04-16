import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double toCollect = Double.parseDouble(scan.nextLine());

//        double cardPayment = 0;
//        double cashPayment = 0;

        double sumCard = 0;
        double sumCash = 0;

        int cashCount = 0;
        int cardCount = 0;

        double averageCS = 0;
        double averageCC = 0;


        String readtext = scan.nextLine();

        while (!"End".equals(readtext)) {
            int cashPayment = Integer.parseInt(readtext);
            readtext = scan.nextLine();
            int cardPayment = Integer.parseInt(readtext);

            if (cashPayment > 100) {
                System.out.println("Error in transaction!");
            } else if (cashPayment < 100) {
                System.out.println("Product sold!");
                sumCash = sumCash + cashPayment;
                cashCount++;
            }
            if (cardPayment < 10) {
                System.out.println("Error in transaction!");
            } else if (cardPayment > 10) {
                System.out.println("Product sold!");
                sumCard = sumCard + cardPayment;
                cardCount++;
            }

            if (sumCard + sumCash >= toCollect) {
                averageCS = sumCash / cashCount;
                averageCC = sumCard / cardCount;
                break;
            }

            readtext = scan.nextLine();
        }

        if ("End".equals(readtext)) {
            System.out.println("Failed to collect required money for charity.");
        } else {
            System.out.printf("Average CS: %.2f%nAverage CC: %.2f", averageCS, averageCC);
        }
    }
}
