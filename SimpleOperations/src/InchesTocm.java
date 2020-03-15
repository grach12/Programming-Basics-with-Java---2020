import java.util.Scanner;

public class InchesTocm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double inches = Double.parseDouble(scan.nextLine());
        double result = inches*2.54;
        System.out.println(result);
    }
}
