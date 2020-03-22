import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double dogs = Integer.parseInt(scan.nextLine())*2.5;
        double allAnimals = Integer.parseInt(scan.nextLine())*4;

        System.out.printf("%.2f lv.", dogs+allAnimals);


    }
}
