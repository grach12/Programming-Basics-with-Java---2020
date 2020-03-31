import java.util.Scanner;


public class Volleyball {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String year = scan.nextLine();
        double holidays = Double.parseDouble(scan.nextLine());
        double weekendsOut = Double.parseDouble(scan.nextLine());

        double playWeekendsSofia = (48-weekendsOut)*(3.0/4);
        double playHoliday = holidays*(2.0/3);


        double playVolley = playHoliday+ weekendsOut +playWeekendsSofia;

        if (year.equals("leap")){
            playVolley = playVolley*1.15;
        }
        System.out.printf("%.0f", Math.floor(playVolley));

        //System.out.println(weekendsOut);
    }
}