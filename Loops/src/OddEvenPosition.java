import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double evenSum = 0;
        double evenMax = -1000000000.0;
        double evenMin = 1000000000.0;
        double oddSum = 0.0;
        double oddMax = -1000000000.0;
        double oddMin = 1000000000.0;

        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(scan.nextLine());
            if (i % 2 == 0) {
                evenSum = evenSum + num;
                if (num > evenMax) {
                    evenMax = num;
                }
                if (num < evenMin) {
                    evenMin = num;
                }
            } else {
                oddSum = oddSum + num;
                if (num > oddMax) {
                    oddMax = num;
                }
                if (num < oddMin) {
                    oddMin = num;
                }
            }
        }
        System.out.printf("OddSum = %.2f", oddSum);
        if (oddMin==1000000000.0){
            System.out.printf("OddMin = No");
        }else{
            System.out.printf("OddMin = ", oddMax);
        }

        System.out.printf("EvenSum + %.2f", evenSum);
        if (oddMin==1000000000.0){
            System.out.printf("EvenMin = No");
        }else{
            System.out.printf("EvenMin = %.2f", evenMin);
        }
        if (evenMax== -1000000000.0){
            System.out.printf("EvenMax=No");
        }else{
            System.out.printf("EvenMax = %.2f", evenMax);
        }
    }
}
