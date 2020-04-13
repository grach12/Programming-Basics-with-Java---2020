import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int profit = Integer.parseInt(scan.nextLine());

        String coctail = scan.nextLine();

        int price = coctail.length();
        double priceDoub = 0.0;
        //System.out.println(price);

        while (!"Party".equals(coctail)) {

            int orders = Integer.parseInt(coctail);
            price = price + orders;
            priceDoub = price;


            if (priceDoub % 2 != 0) {
                priceDoub *= 0.75;
            }


            coctail = scan.nextLine();
        }

        System.out.println(price);
    }
}
