import java.util.Scanner;

public class EasterShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int initialEggAmount = Integer.parseInt(sc.nextLine());

        int soldEggs = 0;

        String command = "";
        while (!"Close".equals(command = sc.nextLine())) {

            int amount = Integer.parseInt(sc.nextLine());

            switch (command) {
                case "Buy":
                    soldEggs += amount;
                    int eggsNow = initialEggAmount;
                    initialEggAmount -= amount;
                    if (initialEggAmount < 0) {
                        System.out.println("Not enough eggs in store!");
                        System.out.printf("You can buy only %d.%n", Math.abs(eggsNow));
                        return;
                    }
                    break;
                case "Fill":
                    initialEggAmount += amount;
                    break;
            }
        }
        System.out.println("Store is closed!");
        System.out.printf("%d eggs sold.%n", soldEggs);
    }
}

//        int eggOnStock = Integer.parseInt(scan.nextLine());
//        String input = "";
//
//
//        int eggToBuy = 0;
//        int order = 0;
//
//        int sellTotal = 0;
//
//        while ( (!"Close".equals(input) || (eggToBuy > eggOnStock))) {
//            input=scan.nextLine();
//            if ("Buy".equals(input)) {
//                eggToBuy = Integer.parseInt(scan.nextLine());
//                eggOnStock = eggOnStock - eggToBuy;
//                sellTotal = sellTotal+eggOnStock;
//
//            } else if ("Fill".equals(input)) {
//                order = Integer.parseInt(scan.nextLine());
//                eggOnStock = eggOnStock + order;
//            }
//
//        }
//        System.out.println(sellTotal);
//    }
//}
