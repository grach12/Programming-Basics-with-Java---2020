import java.util.Scanner;

public class BeehiveRole {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int intellect = Integer.parseInt(scan.nextLine());
        int strength = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine(); // string ["female", "male"].

        if ((intellect >= 80) && (strength >= 80) && (input.equals("female"))) {
            System.out.println("Queen Bee");
        } else if ((intellect >= 80)) {
            System.out.println("Repairing Bee");
        } else if ((intellect >= 60)) {
            System.out.println("Cleaning Bee");
        } else if ((strength >= 80) && (input.equals("male"))) {
            System.out.println("Drone Bee");
        } else if ((strength >= 60) ) {
            System.out.println("Guard Bee");
        }else {
            System.out.println("Worker Bee");
        }
    }
}