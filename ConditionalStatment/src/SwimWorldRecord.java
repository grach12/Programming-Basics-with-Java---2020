import java.util.Scanner;

public class SwimWorldRecord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double worldSwimRecord = Double.parseDouble(scan.nextLine());
        double distance = Double.parseDouble(scan.nextLine());
        double secondPerMeter = Double.parseDouble(scan.nextLine());

        double time = distance*secondPerMeter;
        double delay = Math.floor(distance/15);
        double delayTime = delay*12.5;

        double finalTime = time+delayTime;

if (finalTime<worldSwimRecord){
    System.out.printf("Yes, he succeed! The new world record is %.2f seconds.", finalTime);
}
else {
    double secondsLeft = finalTime-worldSwimRecord;
    System.out.printf("No, he failed! He was %.2f seconds slower.", secondsLeft);
}


    }
}
