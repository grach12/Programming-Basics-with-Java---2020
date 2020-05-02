import java.util.Scanner;

public class BeehivePopulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());  //population
        int year = Integer.parseInt(scan.nextLine()); //year
        int yearCount = 0;
        int die = 0;
        int newPopu = n;
        for ( ; ; ) {
            yearCount++;

            newPopu += newPopu / 10 * 2;

            if (yearCount % 5 == 0) {
                newPopu -= newPopu / 50 * 5;
            }
            newPopu -= newPopu / 20 * 2;

            if (yearCount==year){
                break;
            }
        }
        System.out.printf("Beehive population: %d",newPopu);
    }
}

