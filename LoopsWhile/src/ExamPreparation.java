import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maxCountofPoorGrades = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        int gradeSum = 0;
        int gradesCounter = 0;
        int poorGradeCounter = 0;
        String lastProblemname = "";

        while (!"Enough".equals(input)) {
            String problemName = input;
            int grade = Integer.parseInt(scan.nextLine());

            gradeSum = gradeSum + grade;
            gradesCounter++;
            lastProblemname = problemName;
            if (grade <= 4) {
                poorGradeCounter++;
                if (poorGradeCounter == maxCountofPoorGrades) {
                    break;
                }
            }
            input = scan.nextLine();
        }
        if (poorGradeCounter == maxCountofPoorGrades) {
            System.out.printf("You need a break, %d poor grades.", poorGradeCounter);

        } else {
            double avgScore = gradeSum * 1.0 / gradesCounter;
            System.out.printf("Average score: %.2f%n", avgScore);
            System.out.printf("Number of problems: %d%n", gradesCounter);
            System.out.printf("Last problem: %s", lastProblemname);
        }
    }
}