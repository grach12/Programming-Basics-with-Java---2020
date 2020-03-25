import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int distanceKm = Integer.parseInt(scan.nextLine());
        String dayTime = scan.nextLine();

        double taxiDay = 0.7+(distanceKm*0.79);
        double taxiNight = 0.7+(distanceKm*0.9);
        double bus = 0.09*distanceKm;
        double train = 0.06*distanceKm;

        if (distanceKm>=100){
            System.out.printf("%.2f", train);
        }
        else if (distanceKm>=20){
            System.out.printf("%.2f", bus);
        }
        else if ((distanceKm>=1)&&(dayTime.equals("night"))){
            System.out.printf("%.2f", taxiNight );
        }
        else {
            System.out.printf("%.2f", taxiDay);
        }
    }
}
