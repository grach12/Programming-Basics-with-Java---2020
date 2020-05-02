import java.util.Scanner;

public class CookingCompetition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int bakers = Integer.parseInt(scan.nextLine());
        double price = 0;
        double sum = 0;



        for (int i = 0; i < bakers; i++) {
            int counterCookie = 0;
            int counterCake = 0;
            int counterWaffle = 0;

            String nameBaker = scan.nextLine();
            String input = scan.nextLine(); // cookies cakes waffels
            while (!"Stop baking!".equals(input)) {
                int num = Integer.parseInt(scan.nextLine());

                switch (input) {
                    case "cookies":
                        counterCookie += num;
                        price+=num*1.50;
                        break;
                    case "cakes":
                        counterCake += num;
                        price+=num*7.80;
                        break;
                    case "waffles":
                        counterWaffle += num;
                        price+=num*2.30;
                        break;
                }


                sum += num;
                input = scan.nextLine();

            }

            System.out.printf("%s baked %d cookies, %d cakes and %d waffles.%n",nameBaker, counterCookie, counterCake, counterWaffle);

        }
        System.out.printf("All bakery sold: %.0f%n",sum);
        System.out.printf("Total sum for charity: %.2f lv.%n", price*1.0);
    }
}
