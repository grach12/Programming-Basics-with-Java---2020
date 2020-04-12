import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int i=0;
        double total = 0;
        while (i<n){
            double number = Double.parseDouble(scan.nextLine());

            if (number<0){
                System.out.println("Invalid operation!" );
                break;
            }
            System.out.printf("Increase: %.2f%n", number);
            total+=number;
            i++;
        }
        System.out.printf("Total: %.2f", total);
    }
}
