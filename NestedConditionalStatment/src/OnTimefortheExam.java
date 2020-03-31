import java.util.Scanner;

public class OnTimefortheExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hourExam = Integer.parseInt(scan.nextLine());
        int minExam = Integer.parseInt(scan.nextLine());
        int hourArrive = Integer.parseInt(scan.nextLine());
        int minArrive = Integer.parseInt(scan.nextLine());

        int exam = hourExam * 60 + minExam;
        int arrive = hourArrive * 60 + minArrive;

        int hours = (exam - arrive) / 60;
        int minutes = (exam - arrive) % 60;

        if (arrive > exam) {
            System.out.println("Late");
        } else if (arrive + 30 < exam) {
            System.out.println("Early");
        } else if (arrive <= exam) {
            System.out.println("On time");
        }

        if (exam - arrive - 60 >= 0) {
            System.out.printf("%d:%02d hours before the start", hours, minutes);
        } else if ((arrive - 59 < exam) && (arrive < exam)) {
            System.out.printf("%d minutes before the start", exam - arrive);
        } else if (exam - arrive + 60 <= 0) {
            System.out.printf("%d:%02d hours after the start", Math.abs(hours), Math.abs(minutes));
        } else if ((arrive + 59 > exam) && (arrive > exam)) {
            System.out.printf("%d minutes after the start", arrive - exam);
        }


    }
}
