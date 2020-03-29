import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String fruit = scan.nextLine();
        String day = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        double price = 0.0;

        if (day.equals("Sunday")||day.equals("Saturday")){
switch (fruit){
    case "banana":
        price=2.70;System.out.printf("%.2f", price*quantity);
        break;
    case "apple":
        price=1.25;System.out.printf("%.2f", price*quantity);
        break;
    case "orange":
        price = 0.90;System.out.printf("%.2f", price*quantity);
        break;
    case "grapefruit":
        price = 1.60;System.out.printf("%.2f", price*quantity);
        break;
    case "kiwi":
        price=3;System.out.printf("%.2f", price*quantity);
        break;
    case "pineapple":
        price=5.6;System.out.printf("%.2f", price*quantity);
        break;
    case "grapes":
        price = 4.2;System.out.printf("%.2f", price*quantity);
        break;
    default:
        System.out.println("error");
}
        }
        else if(day.matches("Monday|Tuesday|Wednesday|Thursday|Friday")){
            switch (fruit){
                case "banana":
                    price=2.50;System.out.printf("%.2f", price*quantity);
                    break;
                case "apple":
                    price=1.20;System.out.printf("%.2f", price*quantity);
                    break;
                case "orange":
                    price = 0.85;System.out.printf("%.2f", price*quantity);
                    break;
                case "grapefruit":
                    price = 1.45;System.out.printf("%.2f", price*quantity);
                    break;
                case "kiwi":
                    price=2.7;System.out.printf("%.2f", price*quantity);
                    break;
                case "pineapple":
                    price=5.5;System.out.printf("%.2f", price*quantity);
                    break;
                case "grapes":
                    price = 3.85;System.out.printf("%.2f", price*quantity);
                    break;
                default :
                    System.out.println("error");
            }

        }
        else{
            System.out.println("error");
        }

    }
}
