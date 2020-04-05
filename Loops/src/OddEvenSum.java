import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int oddSum = 0;
        int evenSum = 0 ;

        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scan.nextLine());

            if (i%2 == 0){
                evenSum = evenSum+currentNum;
            }else {
                oddSum=oddSum+currentNum;
            }

        }
        if (evenSum==oddSum){
            System.out.printf("Yes %nSum = %d", oddSum );
        }else {
            System.out.printf("No %nDiff = %d", Math.abs(evenSum-oddSum));
        }

    }
}
