import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int v = Integer.parseInt(scan.nextLine());
        int p1 = Integer.parseInt(scan.nextLine());
        int p2 = Integer.parseInt(scan.nextLine());
        double H = Double.parseDouble(scan.nextLine());

        double timeP1 = p1 * H;
        double timeP2 = p2 * H;

        double fillH = timeP1 + timeP2;

        if (fillH <= v) {
            double diff = v - fillH;
            double total = (v - diff);
            System.out.printf("The pool is %.2f%% full. ", (total / v)*100);
            System.out.printf("Pipe 1: %.2f%%. Pipe 2: %.2f%%.", (total - timeP2) / total * 100, (total - timeP1) / total * 100);
        } else if (fillH > v) {
            double diff = fillH-v;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", H, diff);

        }
    }
}