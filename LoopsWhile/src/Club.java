import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int profit = Integer.parseInt(scan.nextLine());

        String coctail = scan.nextLine();
        int price = coctail.length();
        //System.out.println(price);

        while (!"Party".equals(coctail)) {
            coctail= scan.nextLine(); // тук гърми 2-я текст
            int orders = Integer.parseInt(coctail);
            price = price + orders;

            if (price*1.0 % 2 != 0) {
                price *= 0.75;
            }
           // coctail = scan.nextLine(); // тук гърми 1-я текст
        }
        System.out.println(price);
    }
}

/*
import java.util.Scanner;

public class Club {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double wantedMoney = Double.parseDouble(sc.nextLine());

        double gainedMoney = 0.0;

        while (gainedMoney <= wantedMoney) {
            String cocktailName = sc.nextLine();
            if ("Party!".equals(cocktailName)) {
                break;
            }
            int numberCocktails = Integer.parseInt(sc.nextLine());
            int cocktailPrice = cocktailName.length();
            double orderPrice = numberCocktails * cocktailPrice;
            if (orderPrice % 2 == 1) {
                orderPrice *= 0.75;
            }
            gainedMoney += orderPrice;

        }

        if (gainedMoney >= wantedMoney) {
            System.out.println("Target acquired.");
            System.out.printf("Club income - %.2f leva.", gainedMoney);
        } else {
            double diff = wantedMoney - gainedMoney;
            System.out.printf("We need %.2f leva more.", diff);
            System.out.printf("Club income - %.2f leva.", gainedMoney);

        }
    }
}

 */