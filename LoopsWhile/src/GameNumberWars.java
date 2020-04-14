import java.util.Scanner;

public class GameNumberWars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String playerOne = scan.nextLine();
        String playerTwo = scan.nextLine();

        //int cards = 36;

        int pointsOne = 0;
        int pointsTwo = 0;

        String winner = "";

        int winnerPoints = 0;
        int cardOne = 0;
        int cardTwo = 0;
       String endOfGame = scan.nextLine();
        while (!"End of game".equals(endOfGame)) {
            cardOne = Integer.parseInt(scan.nextLine());
            cardTwo = Integer.parseInt(scan.nextLine());

            if (cardOne > cardTwo) {
                pointsOne = cardOne - cardTwo;

            } else if (cardTwo > cardOne) {
                pointsTwo = cardTwo - cardOne;


            } else {
                System.out.println("Number wars!");
                int cardOneWars = Integer.parseInt(scan.nextLine());
                int cardTwoWars = Integer.parseInt(scan.nextLine());
                if (cardOneWars > cardTwoWars) {
                    winner = playerOne;
                    winnerPoints = cardOneWars-cardTwoWars;
                } else if (cardTwoWars > cardOneWars) {
                    winner = playerTwo;
                    winnerPoints = cardTwoWars-cardOneWars;
                }
                System.out.printf("%s is winner with %d points", winner, winnerPoints)
                ;break;
            }

            endOfGame = scan.nextLine();
        }




      //    if (pointsOne > pointsTwo) {
        //    System.out.printf("%s has %d points%n%s has %d points", playerOne, pointsOne, playerTwo, pointsTwo);
  //      }

    }
}
