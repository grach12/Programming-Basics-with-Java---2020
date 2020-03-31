import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();

        String clas = "";
        String carType="";


        if (budget>500){
            clas = "Luxury class";
            carType = "Jeep";
            budget*=0.9;
        }
        else if ((budget>100)&&(budget<=500)){

        }

        System.out.printf("%s%n%s - %.2f", clas, carType, budget);

    }
}
