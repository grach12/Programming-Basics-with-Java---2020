import java.util.Scanner;

public class FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fuelType = scan.nextLine();

        double fuelLiters = Double.parseDouble(scan.nextLine());
        String card = scan.nextLine();

        double gasoline = fuelLiters * 2.22;
        double diesel = fuelLiters * 2.33;
        double gas = fuelLiters * 0.93;

        if (card.equals("Yes")) {
            gasoline -= 0.18 * fuelLiters;
            diesel -= 0.12 * fuelLiters;
            gas -= 0.08 * fuelLiters;
        }

        // System.out.println(gas);

        if (fuelLiters >= 20 && fuelLiters <= 25) {
            gasoline *= 0.92;
            diesel *= 0.92;
            gas *= 0.92;

            if (fuelType.equals("Gasoline")) {
                System.out.printf("%.2f lv.", gasoline);
            } else if (fuelType.equals("Diesel")) {
                System.out.printf("%.2f lv.", diesel);
            } else if (fuelType.equals("Gas")) {
                System.out.printf("%.2f lv.", gas);
            }
        } else if (fuelLiters >= 25) {
            gasoline *= 0.90;
            diesel *= 0.90;
            gas *= 0.90;
            if (fuelType.equals("Gasoline")) {
                System.out.printf("%.2f lv.", gasoline);
            } else if (fuelType.equals("Diesel")) {
                System.out.printf("%.2f lv.", diesel);
            } else if (fuelType.equals("Gas")) {
                System.out.printf("%.2f lv.", gas);
            }
        } else {
            if (fuelType.equals("Gasoline")) {
                System.out.printf("%.2f lv.", gasoline);
            } else if (fuelType.equals("Diesel")) {
                System.out.printf("%.2f lv.", diesel);
            } else if (fuelType.equals("Gas")) {
                System.out.printf("%.2f lv.", gas);
            }

        }


    }
}
