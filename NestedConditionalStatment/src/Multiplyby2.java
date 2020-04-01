import java.util.Scanner;

public class Multiplyby2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number = Double.parseDouble(scan.nextLine());
        while (number >= 0) {
            System.out.printf("Result: %.2f%n", number * 2);
            number = Double.parseDouble(scan.nextLine());
        }
        System.out.println("Negative number!");
    }
}

        /*double num = Double.MAX_VALUE;
        while (num>0){
            double num2 = Double.parseDouble(scan.nextLine());
            num++;
            if (num2<0){
                break;
            }
            System.out.printf("Result: %.2f%n",num2*2);
        }
        System.out.println("Negative number!");
    }
}
*/