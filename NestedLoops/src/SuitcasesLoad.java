import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double capacity = Double.parseDouble(scan.nextLine());

        String command = scan.nextLine();
        int counter = 0;

        while (!"End".equals(command)) {

            double suitcaseVolume = Double.parseDouble(command);

            if (counter % 3 == 0) {
                suitcaseVolume *= 1.1;
            }
            capacity -= suitcaseVolume;

            if (capacity < 0) {
                break;
            }
            counter++;
            //System.out.println(capacity);

            command = scan.nextLine();
        }
        if (capacity >= 0) {
            System.out.println("Congratulations! All suitcases are loaded!");
        } else {
            System.out.println("No more space!");
        }
        // System.out.println("Останало к-во " + capacity);
        System.out.println("Statistic: " + counter + " suitcases loaded.");
    }
}

