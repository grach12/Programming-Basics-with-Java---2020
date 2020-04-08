import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int days = Integer.parseInt(scan.nextLine());
        double totalFood = Double.parseDouble(scan.nextLine());

double cookies = 0;
double cats=0;
double dogs=0;

        for (int i = 0; i <days ; i++) {
            double dogFood = Double.parseDouble(scan.nextLine());
            double catFood = Double.parseDouble(scan.nextLine());
dogs = dogs+dogFood;
cats= cats+catFood;
totalFood=dogs+cats; // на прав път сме

            if (i % 3 == 0) {
                cookies=(dogFood+catFood)*0.9;
                cookies++;
            }



        }

        System.out.println(totalFood);

    }
}
