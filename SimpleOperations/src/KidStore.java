import java.util.Scanner;

public class KidStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double priceExcursion = Double.parseDouble(scan.nextLine());

        int countPuzzles = Integer.parseInt(scan.nextLine());
        int countDolls =   Integer.parseInt(scan.nextLine());
        int countBear =    Integer.parseInt(scan.nextLine());
        int countMinions = Integer.parseInt(scan.nextLine());
        int countTrucks =  Integer.parseInt(scan.nextLine());

        int countAll = countBear+countDolls+countMinions+countPuzzles+countTrucks;


        double totalPrice = countPuzzles*2.60 + countDolls*3 + countBear*4.1+countMinions*8.2+countTrucks*2;


        if (countAll>=50){
          totalPrice=totalPrice*0.75;
}
        totalPrice=totalPrice*0.9;

          if (totalPrice>=priceExcursion){
              System.out.printf("Yes! %.2f lv left.",totalPrice-priceExcursion);
          }

          else {
              System.out.printf("Not enough money! %.2f lv needed.", priceExcursion-totalPrice);
          }

    }
}
