import java.util.Scanner;

public class Darts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startPoints = 301;
        String playerName = scan.nextLine();

        int counter = 0;
        int badCounter = 0;

        String command = "";
        while (!"Retire".equals(command)&&(startPoints!=0)) {
            command = scan.nextLine();
            int newPoints = Integer.parseInt(scan.nextLine());

            if (newPoints <= startPoints) {
                switch (command) {
                    case "Single":
                        startPoints -= newPoints;
                        break;
                    case "Double":
                        startPoints -= newPoints * 2;
                        break;
                    case "Triple":
                        startPoints -= newPoints * 3;
                        break;
                }
                counter++;
            }
            else {
                badCounter++;
            }

//            System.out.println("Good" + counter);
//            System.out.println("Bad " + badCounter );
        }

        if (startPoints==0){
            System.out.printf("%s won the leg with %d shots.",playerName, counter );
        }
        else {
            System.out.printf("%s retired after %d unsuccessful shots.", playerName, badCounter);
        }
//        System.out.println(playerName + counter);
//        System.out.println(playerName + badCounter);
    }
}