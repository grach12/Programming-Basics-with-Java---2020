import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double N1 = Double.parseDouble(scan.nextLine());
        double N2 = Double.parseDouble(scan.nextLine());
        String operator = scan.nextLine();
        double result;
        String even = "";

        switch (operator) {
            case "+":
                result = N1 + N2;
                if (result % 2 == 0) {
                    even = "even";
                } else {
                    even = "odd";
                }
                System.out.printf("%.0f %s %.0f = %.0f - %s", N1, operator, N2, result, even);
                break;
            case "-":
                result = N1 - N2;
                if (result % 2 == 0) {
                    even = "even";
                } else {
                    even = "odd";
                }
                System.out.printf("%.0f %s %.0f = %.0f - %s", N1, operator, N2, result, even);
                break;
            case "*":
                result = N1 * N2;
                if (result % 2 == 0) {
                    even = "even";
                } else {
                    even = "odd";
                }
                System.out.printf("%.0f %s %.0f = %.0f - %s", N1, operator, N2, result, even);
                break;
            case "/":
                if (N2 != 0) {
                    System.out.printf("%.0f / %.0f = %.2f", N1, N2, N1 / N2);
                } else {
                    System.out.printf("Cannot divide %.0f by zero", N1);
                }
                break;
            case "%":
                if (N2 != 0) {
                    System.out.printf("%.0f %% %.0f = %.0f", N1, N2, N1 % N2);
                } else {
                    System.out.printf("Cannot divide %.0f by zero", N1);
                }
                break;
        }


    }
}