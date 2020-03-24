import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int freeDays = Integer.parseInt(scan.nextLine());
        int workTime = 365 - freeDays;

        int catMinutes = 30000;

        int workMinutes = 63 * workTime;
        int freeTimeMin = 127 * freeDays;
        int totalMinutes = workMinutes + freeTimeMin;
        // System.out.println(totalMinutes);
//int hours = totalMinutes/60;
//int minRest = totalMinutes%60;
        if (catMinutes > totalMinutes) {
            totalMinutes = catMinutes - totalMinutes;
            System.out.printf("Tom sleeps well%n %d hours and %d minutes less for play", TimeUnit.MINUTES.toHours(totalMinutes), totalMinutes % 60);
        } else {
            totalMinutes = totalMinutes - catMinutes;
            System.out.printf("Tom will run away%n %d hours and %d minutes more for play", totalMinutes / 60, totalMinutes % 60);
        }


    }
}
