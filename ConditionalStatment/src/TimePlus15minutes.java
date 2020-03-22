import java.util.Scanner;

public class TimePlus15minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startHours = Integer.parseInt(scan.nextLine());
        int startMinutes = Integer.parseInt(scan.nextLine());

        int minutesPlus15 = startHours*60+startMinutes+15;


        int finnalHours=minutesPlus15/60;
        int finalMinutes = minutesPlus15%60;

        if(finnalHours>23){
            finnalHours=0;
        }
        if(finalMinutes<10){
            System.out.printf("%d:0%d", finnalHours, finalMinutes);
        }
        else {
            System.out.printf("%d:%d", finnalHours, finalMinutes);
        }

    }
}
