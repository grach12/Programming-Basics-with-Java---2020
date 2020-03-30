import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String month = scan.nextLine();
        int nights = Integer.parseInt(scan.nextLine());

        double apartment = 0.00;
        double studio = 0.00;

        switch (month) {
            case "May":
            case "October":
                studio = 50;
                apartment = 65;
                if ((nights > 7) && (nights <= 14)) {
                    studio *= 0.95;
                } else if (nights > 14) {
                    studio *= 0.7;
                }
                break;
            case "June":
            case "September":
                studio = 75.20;
                apartment = 68.70;
                if (nights > 14) {
                    studio *= 0.8;
                }
                break;
            case "July":
            case "August":
                studio = 76;
                apartment = 77;
                break;
        }
        if (nights > 14) {
            apartment *= 0.90;
        }
        System.out.printf("Apartment: %.2f lv.%n", nights * apartment);
        System.out.printf("Studio: %.2f lv.", nights * studio);

    }
}
