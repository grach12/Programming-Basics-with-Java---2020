import java.util.Scanner;

public class EasterBake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cake = Integer.parseInt(scan.nextLine());

        int sugarWeight = 950;
        int flourWeight = 750;

        double needSugar = 0;
        double needFlour = 0;

int maxSugar = Integer.MIN_VALUE;
int maxFlour = Integer.MIN_VALUE;

        for (int i = 1; i <= cake ; i++) {
            int sugarPerCake = Integer.parseInt(scan.nextLine());
            int flourPerCake = Integer.parseInt(scan.nextLine());

            needSugar+=sugarPerCake;
            needFlour+=flourPerCake;

            if (sugarPerCake>maxSugar){
                maxSugar= sugarPerCake;
            }
            if (flourPerCake>maxFlour){
                maxFlour=flourPerCake;
            }
        }

      //  System.out.println(needSugar);
        double sugarPack = Math.ceil(needSugar/950);
        double flourPack = Math.ceil(needFlour/750);

        System.out.printf("Sugar: %.0f%n",sugarPack);
        System.out.printf("Flour: %.0f%n",flourPack);
       System.out.printf("Max used flour is %d grams, max used sugar is %d grams.",maxFlour, maxSugar);
      //  System.out.println(maxSugar);
      //  System.out.println(maxFlour);
    }
}
