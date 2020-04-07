import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());

        int cured = 0;
        int fucked = 0;

        int doctors = 7;

        for (int i = 1; i <= days; i++) {
            int patients = Integer.parseInt(scan.nextLine());

            if ((i % 3 == 0) && (fucked > cured)) {
                doctors++;
            }
            if (patients > doctors) {
                cured += doctors;
                fucked += patients - doctors;
            } else {
                cured += patients;
            }
        }
        System.out.printf("Treated patients: %d.%n", cured);
        System.out.printf("Untreated patients: %d.", fucked);
    }
}
