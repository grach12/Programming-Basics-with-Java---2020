import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fuelType = scan.nextLine().toLowerCase();
        int liters = Integer.parseInt(scan.nextLine());

        if (!fuelType.matches("diesel|gasoline|gas")) {
            System.out.println("Invalid fuel!");
        } else if (liters >= 25) {
            System.out.printf("You have enough %s.", fuelType);
        } else if (liters >= 0) {
            System.out.printf("Fill your tank with %s!", fuelType);
        }
    }
}
