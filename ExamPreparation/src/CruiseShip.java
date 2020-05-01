import java.util.Scanner;

public class CruiseShip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String cruise = scan.nextLine();
        String cabin = scan.nextLine();
        int nights = Integer.parseInt(scan.nextLine())*4;


        if (nights < 7) {
            if ("standard cabin".equals(cabin)) {
                switch (cruise) {
                    case "Mediterranean":
                        double price = 27.50;
                        System.out.printf("Annie's holiday in the %s sea costs %.2f lv.", cruise, price*nights);
                        break;
                    case "Adriatic":
                        price = 22.99;
                        System.out.printf("Annie's holiday in the %s sea costs %.2f lv.", cruise, price*nights);
                        break;
                    case "Aegean":
                        price = 23.00;
                        System.out.printf("Annie's holiday in the %s sea costs %.2f lv.", cruise, price*nights);
                        break;
                }
            } else if ("cabin with balcony".equals(cabin)) {
                switch (cruise) {
                    case "Mediterranean":
                        double price = 30.20;
                        System.out.printf("Annie's holiday in the %s sea costs %.2f lv.", cruise, price*nights);
                        break;
                    case "Adriatic":
                        price = 25.00;
                        System.out.printf("Annie's holiday in the %s sea costs %.2f lv.", cruise, price*nights);
                        break;
                    case "Aegean":
                        price = 26.60;
                        System.out.printf("Annie's holiday in the %s sea costs %.2f lv.", cruise, price*nights);
                        break;
                }
            } else if ("apartment".equals(cabin)) {
                switch (cruise) {
                    case "Mediterranean":
                        double price = 40.50;
                        System.out.printf("Annie's holiday in the %s sea costs %.2f lv.", cruise, price*nights);
                        break;
                    case "Adriatic":
                        price = 34.99;
                        System.out.printf("Annie's holiday in the %s sea costs %.2f lv.", cruise, price*nights);
                        break;
                    case "Aegean":
                        price = 39.80;
                        System.out.printf("Annie's holiday in the %s sea costs %.2f lv.", cruise, price*nights);
                        break;
                }
            }
        } else {
            if ("standard cabin".equals(cabin)) {
                switch (cruise) {
                    case "Mediterranean":
                        double price = 27.50*0.75;
                        System.out.printf("Annie's holiday in the %s sea costs %.2f lv.", cruise, price*nights);
                        break;
                    case "Adriatic":
                        price = 22.99*0.75;
                        System.out.printf("Annie's holiday in the %s sea costs %.2f lv.", cruise, price*nights);
                        break;
                    case "Aegean":
                        price = 23.00*0.75;
                        System.out.printf("Annie's holiday in the %s sea costs %.2f lv.", cruise, price*nights);
                        break;
                }
            } else if ("cabin with balcony".equals(cabin)) {
                switch (cruise) {
                    case "Mediterranean":
                        double price = 30.20*0.75;
                        System.out.printf("Annie's holiday in the %s sea costs %.2f lv.", cruise, price*nights);
                        break;
                    case "Adriatic":
                        price = 25.00*0.75;
                        System.out.printf("Annie's holiday in the %s sea costs %.2f lv.", cruise, price*nights);
                        break;
                    case "Aegean":
                        price = 26.60*0.75;
                        System.out.printf("Annie's holiday in the %s sea costs %.2f lv.", cruise, price*nights);
                        break;
                }
            } else if ("apartment".equals(cabin)) {
                switch (cruise) {
                    case "Mediterranean":
                        double price = 40.50*0.75;
                        System.out.printf("Annie's holiday in the %s sea costs %.2f lv.", cruise, price*nights);
                        break;
                    case "Adriatic":
                        price = 34.99*0.75;
                        System.out.printf("Annie's holiday in the %s sea costs %.2f lv.", cruise, price*nights);
                        break;
                    case "Aegean":
                        price = 39.80*0.75;
                        System.out.printf("Annie's holiday in the %s sea costs %.2f lv.", cruise, price*nights);
                        break;
                }

            }

        }

    }
}