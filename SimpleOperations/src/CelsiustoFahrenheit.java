import java.util.Scanner;

public class CelsiustoFahrenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double celsius = Double.parseDouble(scan.nextLine());

        System.out.printf("%.2f", celsius*1.8 + 32);


    }
}
