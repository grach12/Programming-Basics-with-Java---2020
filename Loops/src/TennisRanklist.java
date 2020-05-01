import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double startPoints = Double.parseDouble(scan.nextLine());

        double points;
        double endPoint = 0;

        int win = 0;

        for (int i = 1; i <= n; i++) {
            String rate = scan.nextLine();

            if ("W".equals(rate)){
                points=2000;
                endPoint+=points;
                win++;
            }
            if ("F".equals(rate)){
                points=1200;
                endPoint+=points;
            }
            if ("SF".equals(rate)){
                points=720;
                endPoint+=points;
            }
        }
        System.out.printf("Final points: %.0f%n",(endPoint+startPoints));
        System.out.printf("Average points: %.0f%n", endPoint/n);
        //System.out.println(win);
        System.out.printf("%.2f%%",(win*1.0/n*1.0)*100);
    }
}
