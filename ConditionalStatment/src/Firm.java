import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int needHours = Integer.parseInt(scan.nextLine());
        int availableDays = Integer.parseInt(scan.nextLine());
        int overtimeWorkers = Integer.parseInt(scan.nextLine());

        double workDays = availableDays*0.9;
        double workHours = workDays*8;
        double overTime = overtimeWorkers*availableDays*2;

        double totalTime = Math.floor(overTime+workHours);

        if (totalTime>=needHours) {
            System.out.printf("Yes!%.0f hours left.", totalTime-needHours);
        }
        else {
            System.out.printf("Not enough time!%.0f hours needed.", needHours-totalTime);
        }
    }
}
