import java.util.Scanner;

public class LeftandRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int leftSum = 0;
        int rightSum = 0;

        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < n * 2; i++) {//решението на Дойчо
            int number = Integer.parseInt(scan.nextLine());
            if (i < n) {
                sumLeft = sumLeft + number;
            } else {
                sumRight = sumRight + number;
            }
        }
        if (sumLeft == sumRight) {
            System.out.printf("Yes, sum = %d", sumLeft);
        } else {
            System.out.printf("No, diff = %d", Math.abs((sumLeft - sumRight)));
        }
        }

    }

//        for (int i = 0; i < n; i++) {
//            int leftNum = Integer.parseInt(scan.nextLine());
//            leftSum = leftSum + leftNum;
//        }
//        // System.out.println(leftSum);
//
//        for (int i = 0; i < n; i++) {
//            int rightNum = Integer.parseInt(scan.nextLine());
//            rightSum = rightSum + rightNum;
//        }
//
//        if (leftSum == rightSum) {
//            System.out.printf("Yes, sum = %d", leftSum);
//        } else {
//            System.out.printf("No, diff = %d", Math.abs(leftSum - rightSum));
//        }
//    }
//}
