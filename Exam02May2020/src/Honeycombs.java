import java.util.Scanner;

public class Honeycombs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int been = Integer.parseInt(scan.nextLine());
        int flowers = Integer.parseInt(scan.nextLine());

        double honeycomb = (been*flowers*0.21);
        double result = Math.floor(honeycomb/100);

        System.out.printf("%.0f honeycombs filled.%n", result);
        System.out.printf("%.2f grams of honey left.", honeycomb-result*100);

    }
}
