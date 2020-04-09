import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int days = Integer.parseInt(scan.nextLine());
        double totalFood = Double.parseDouble(scan.nextLine());

double cookies = 0;
double cats=0;
double dogs=0;
double eatenFood = 0;


        for (int i = 1; i <=days ; i++) {
            double dogFood = Double.parseDouble(scan.nextLine());
            double catFood = Double.parseDouble(scan.nextLine());
            dogs = dogs+dogFood;
            cats= cats+catFood;
            eatenFood=dogs+cats;

            if (i % 3 == 0) {
               // System.out.println(dogFood+catFood);
                cookies+=(dogFood+catFood)*0.1;
                //cookies++;
            }
        }
        System.out.printf("Total eaten biscuits: %.0fgr.%n",cookies);
        System.out.printf("%.2f%% of the food has been eaten.%n",eatenFood/totalFood*100);
        System.out.printf("%.2f%% eaten from the dog.%n",dogs/eatenFood*100);
        System.out.printf("%.2f%% eaten from the cat.",cats/eatenFood*100);
    }
}
