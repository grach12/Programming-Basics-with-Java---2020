import java.util.Scanner;

public class HighJump {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int record = Integer.parseInt(scan.nextLine());
        int jump = 0;
        int failed = 0;
        int counter = 0;

        int firstJump = record - 30;

        while (jump >= record) {
            jump = Integer.parseInt(scan.nextLine());
            if (jump < firstJump) {
                failed++;
                if (failed >= 3) {
                    break;
                }

            }
            firstJump += 5;
            counter++;

        }
if (failed>=3){
    System.out.printf("Tihomir failed at %d cm after %d jumps.", firstJump, failed);
}

else {
    System.out.printf("Tihomir succeeded, he jumped over %d cm after %d jumps.", jump, counter );
}
    }
}
