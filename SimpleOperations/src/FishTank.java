import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lenght = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());

        double volumeAquarim = lenght*width*height;
        double totalVolume = volumeAquarim*0.001; //превръщаме от куб.дм в литри
        double percents = percent*0.01;
        double litersNeed = totalVolume*(1-percents);

        System.out.printf("%.3f", litersNeed);
    }
}
