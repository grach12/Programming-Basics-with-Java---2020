import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String actor = scan.nextLine();
        double pointsAcademi = Double.parseDouble(scan.nextLine());
        int questor = Integer.parseInt(scan.nextLine());

        double totalPoints = 0;

        for (int i = 0; i < questor ; i++) {
            String jury = scan.nextLine();
            double questorPoint = Double.parseDouble(scan.nextLine());

            int juryInt = jury.length();

            totalPoints=totalPoints+questor;
totalPoints= (juryInt*questorPoint)/2;




        }
      //  System.out.println(totalPoints+pointsAcademi);
    }
}