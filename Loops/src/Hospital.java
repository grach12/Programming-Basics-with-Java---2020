import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());

        int cured = 0;
        int fucked = 0;

        int total = 0;
        for (int i = 0; i < days; i++) {
            int patients = Integer.parseInt(scan.nextLine());
            total = total + patients;
            if (patients>7){
                fucked= patients-fucked;
            }
        }
            System.out.println(cured);
            System.out.println(fucked);
        }
    }
