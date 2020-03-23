import java.util.Scanner;

public class TrapeziodArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double b1 = Double.parseDouble(scan.nextLine());
        double b2 = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        System.out.printf("%.2f",(b1 + b2) * h / 2);

    }
}
