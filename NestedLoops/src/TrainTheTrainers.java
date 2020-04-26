import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int jury = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        double totalScore = 0.0;
        int count = 0;

        while (!"Finish".equals(input)){
            double currentPresentationScore =0.0;
            for (int i = 0; i < jury ; i++) {
                double grade = Double.parseDouble(scan.nextLine());
                currentPresentationScore+=grade;
            }
            double avaregeScore = currentPresentationScore/jury;
            System.out.printf("%s - %.2f.%n", input, currentPresentationScore/jury);
            totalScore+=avaregeScore;
            count++;
            input=scan.nextLine();
        }
        double finalScore = totalScore/count;
        System.out.printf("Student's final assessment is %.2f.", finalScore);
    }
}
