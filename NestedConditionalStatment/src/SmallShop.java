import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
        String city = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());
        double price = 0.00;
        if (city.equals("Sofia")){
            switch (product){
                case "coffee":
                    price = 0.50;
                    break;
                case "water":
                    price = 0.8;
                    break;
                case "beer":
                    price=1.2;
                    break;
                case "sweets":
                    price=1.45;
                    break;
                case "peanuts":
                    price=1.60;
                    break;
            }
        }
        else if (city.equals("Plovdiv")){
            switch (product){
                case "coffee":
                    price = 0.40;
                    break;
                case "water":
                    price = 0.7;
                    break;
                case "beer":
                    price=1.15;
                    break;
                case "sweets":
                    price=1.3;
                    break;
                case "peanuts":
                    price=1.50;
                    break;
            }

        }
        else if (city.equals("Varna")){
            switch (product){
                case "coffee":
                    price = 0.45;
                    break;
                case "water":
                    price = 0.7;
                    break;
                case "beer":
                    price=1.1;
                    break;
                case "sweets":
                    price=1.35;
                    break;
                case "peanuts":
                    price=1.55;
                    break;
            }
        }

        System.out.printf("%.2f",price*quantity);
    }
}
