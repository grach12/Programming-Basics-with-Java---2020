import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNum = Integer.parseInt(scan.nextLine());
        int secondNum = Integer.parseInt(scan.nextLine());

        for (int i = firstNum; i <= secondNum; i++) {
            //1111

            String currentNum = "" + i;

            //"1111"

            int oddSum = 0;
            int evenSum = 0;
            for (int j = 0; j < currentNum.length(); j++) {
                //"1111".length()  =4
                //j=0..3
                int currentDigit = Integer.parseInt("" + currentNum.charAt(j));
                //
                if (j % 2 == 0) {
                    evenSum += currentDigit;
                } else {
                    oddSum += currentDigit;
                }
            }
            if (oddSum == evenSum) {
                System.out.print(i + " ");
            }
        }

    }
}
