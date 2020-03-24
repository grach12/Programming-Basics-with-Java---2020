import java.util.Scanner;

public class CircleAreaandPerimeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double r = Double.parseDouble(scan.nextLine());

        double perimeter = 2 * Math.PI * r;
        double are =  Math.PI * r * r;

        System.out.printf("%.2f%n%.2f",are , perimeter);
    }
}
