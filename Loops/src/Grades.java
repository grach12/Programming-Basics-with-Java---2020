import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int students = Integer.parseInt(scan.nextLine());
        double topStudents = 0;
        double four = 0;
        double three = 0;
        double fail = 0;

        double average = 0.0;
        double sumGrade = 0;

        for (int i = 1; i <= students; i++) {
            double grade = Double.parseDouble(scan.nextLine());
            sumGrade = sumGrade + grade;

            if (grade >= 5) {
                topStudents++;
            }
            if ((grade >= 4) && (grade < 5)) {
                four++;
            }
            if ((grade >= 3) && (grade < 4)) {
                three++;
            }
            if (grade < 3) {
                fail++;
            }
        }
        topStudents = topStudents / students * 100;
        four = four / students * 100;
        three = three / students * 100;
        fail = fail / students * 100;

        average = sumGrade / students;

        System.out.printf("Top students: %.2f%%%n", topStudents);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", four);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", three);
        System.out.printf("Fail: %.2f%%%n", fail);
        System.out.printf("Average: %.2f", average);
    }
}