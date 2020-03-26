import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int daysOut = Integer.parseInt(scan.nextLine());
        int foodLeft = Integer.parseInt(scan.nextLine());
        double dogsFood = Double.parseDouble(scan.nextLine());
        double catsFood = Double.parseDouble(scan.nextLine());
        double turtFood = Double.parseDouble(scan.nextLine());

        double animalEat = dogsFood*daysOut+catsFood*daysOut+turtFood*daysOut/1000;

        if (animalEat<=foodLeft){
            System.out.printf("%.0f kilos of food left.", Math.floor(foodLeft-animalEat));
        }
        else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(animalEat-foodLeft));
        }
    }
}
