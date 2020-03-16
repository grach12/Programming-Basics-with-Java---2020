import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double yardArea = Double.parseDouble(scan.nextLine());

        double totalYard = yardArea*7.61;
        double discount = totalYard*0.18;

        double finalPrice = totalYard-discount;

        System.out.printf("The final price is: %.2f lv.%n",finalPrice);
        System.out.printf("The discount is: %.2f lv.", discount);

    }
}
