import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String student = scan.nextLine();

        int grade = 1;
        double average = 0;
        while (grade <= 12) {
            double rate = Double.parseDouble(scan.nextLine());
            if (rate >= 4) {
                average += rate;
                grade++;
            }
        }
        average /= 12;
        System.out.printf("%s graduated. Average grade: %.2f", student, average);
    }
}
