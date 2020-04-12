import java.util.Scanner;

public class GraduadePart2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String student = scan.nextLine();

        int grade = 1;
        double average = 0;
        int failedCounter = 0;
        boolean excluded = false;
        while (grade <= 12) {
            double rate = Double.parseDouble(scan.nextLine());

            if (rate >= 4) {
                average += rate;
                grade++;
            } else {
                failedCounter++;
                if (failedCounter == 2) {
                    excluded = true;
                    break;
                }
            }
        }
        if (excluded) {
            System.out.printf("%s has been excluded at %d grade", student, grade);
        } else {
            average /= 12;
            System.out.printf("%s graduated. Average grade: %.2f", student, average);
        }
    }
}

