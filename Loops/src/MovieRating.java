import java.util.Scanner;

public class MovieRating {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        double maxRate = -1000000000.0;
        double minRate = 1000000000.0;
        double averageRate = 0.0;
        double allRate = 0;

        String title = "";
        String maxTitle = "";
        String minTitle ="";

        for (int i = 0; i < n; i++) {
            title = scan.nextLine();
            double rating = Double.parseDouble(scan.nextLine());

            if (rating > maxRate) {
                maxRate = rating;
                maxTitle=title;
            }
            if (rating < minRate) {
                minRate = rating;
                minTitle=title;
            }


            allRate = allRate + rating;
            averageRate = allRate / n;
        }
        System.out.printf("%s is with highest rating: %.1f%n",maxTitle, maxRate);
        System.out.printf("%s is with lowest rating: %.1f%n",minTitle, minRate);
        System.out.printf("Average rating: %.1f", averageRate);


    }

}
