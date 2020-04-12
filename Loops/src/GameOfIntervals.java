import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int moves = Integer.parseInt(scan.nextLine());

        double points  = 0;
        var firstInterval = 0.0;
        var secondInterval = 0.0;
        var thirdInterval = 0.0;
        var forthInterval = 0.0;
        var fiftInterval = 0.0;
        var invalidNum = 0.0;

        for (int i = 0; i < moves  ; i++) {
            int nwenum = Integer.parseInt(scan.nextLine());
            if (nwenum >= 0 && nwenum <= 9)
            {
                points += nwenum * 0.2;
                firstInterval++;
            }
            else if (nwenum >= 10 && nwenum <= 19)
            {
                points += nwenum * 0.3;
                secondInterval++;
            }
            else if (nwenum >= 20 && nwenum <= 29)
            {
                points += nwenum * 0.4;
                thirdInterval++;
            }
            else if (nwenum >= 30 && nwenum <= 39)
            {
                points += 50;
                forthInterval++;
            }
            else if (nwenum >= 40 && nwenum <= 50)
            {
                points += 100;
                fiftInterval++;
            }
            else
            {
                points /= 2;
                invalidNum++;
            }
        }
        System.out.printf("%.2f%n",points);
        System.out.printf("From 0 to 9: %.2f%%%n", firstInterval/moves*100);
        System.out.printf("From 10 to 19: %.2f%%%n", secondInterval/moves*100);
        System.out.printf("From 20 to 29: %.2f%%%n", thirdInterval/moves*100);
        System.out.printf("From 30 to 39: %.2f%%%n", forthInterval/moves*100);
        System.out.printf("From 40 to 50: %.2f%%%n", fiftInterval/moves*100);
        System.out.printf("Invalid numbers: %.2f%%",invalidNum/moves*100);
    }
}
