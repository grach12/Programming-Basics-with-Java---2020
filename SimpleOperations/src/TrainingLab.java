import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double w = Double.parseDouble(scan.nextLine())*100;
        double h = Double.parseDouble(scan.nextLine())*100-100;

        double hDesk = 70;
        double hSpace = Math.floor(h/hDesk);
      // System.out.println(hSpace);

        double wDesk = 120;
        double wSpace = Math.floor(w/wDesk);
        System.out.println(wSpace*hSpace-3);

    }
}
