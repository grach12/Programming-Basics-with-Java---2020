import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String movieType = scan.nextLine();
        int rows = Integer.parseInt(scan.nextLine());
        int columns = Integer.parseInt(scan.nextLine());

        double premiere = rows*columns*12.00;
        double normal = rows*columns*7.50;
        double discount = rows*columns*5.00;

        switch (movieType){
            case "Premiere":
                System.out.printf("%.2f leva", premiere);break;
            case "Normal":
                System.out.printf("%.2f leva", normal);break;
            case "Discount":
                System.out.printf("%.2f leva", discount);break;
        }


    }
}
