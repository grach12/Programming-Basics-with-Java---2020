import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double L = Double.parseDouble(scan.nextLine());
        double W = Double.parseDouble(scan.nextLine());
        double A = Double.parseDouble(scan.nextLine());

        double totolArea = (L*100)*(W*100);
        double wardrobe = (A*100)*(A*100);
        double bench = totolArea/10;

        double freeSpace = totolArea-wardrobe-bench;

       // System.out.println(freeSpace);

        double dancers = Math.floor(freeSpace/(7040));

        System.out.printf("%.0f",dancers);

    }
}
