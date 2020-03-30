import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
                double temp = Double.parseDouble(scan.nextLine());
                String dayTime = scan.nextLine();

                String Outfit = "";
                String Shoes = "" ;

                switch (dayTime) {
                    case "Morning":
                        if ((temp >= 10) && (temp <= 18)) {
                            Outfit = "Sweatshirt";
                            Shoes = "Sneakers";
                        } else if ((temp > 18) && (temp <= 24)) {
                            Outfit = "Shirt";
                            Shoes = "Moccasins";
                        } else {
                            Outfit = "T-Shirt";
                            Shoes = "Sandals";
                        }
                        break;
                    case "Afternoon":
                        if ((temp >= 10) && (temp <= 18)) {
                            Outfit = "Shirt";
                            Shoes = "Moccasins";
                        } else if ((temp >= 18) && (temp <= 24)) {
                            Outfit = "T-Shirt";
                            Shoes = "Sandals";
                        } else {
                            Outfit = "Swim Suit";
                            Shoes = "Barefoot";
                        }
                        break;
                    case "Evening":
                        Outfit = "Shirt";
                        Shoes = "Moccasins";
                        break;
                }
                System.out.printf("It's %.0f degrees, get your %s and %s.", temp, Outfit, Shoes);

            }
        }


        /*Scanner scan = new Scanner(System.in);

        int temperature = Integer.parseInt(scan.nextLine());
        String dayTime = scan.nextLine();

        switch (dayTime){
            case "Morning":
                if (temperature>=10 && temperature<=18) {
                    System.out.printf("It's %d degrees, get your Sweatshirt and Sneakers.", temperature);
                }else if (temperature>18&&temperature<=24){
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", temperature);
                }else {
                    System.out.printf("It's %d degrees, get your T-shirt and Sandals.", temperature);
                }
                break;
            case "Afternoon":
                if (temperature>=10 && temperature<=18) {
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", temperature);
                }else if (temperature>18&&temperature<=24){
                    System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", temperature);
                }else {
                    System.out.printf("It's %d degrees, get your Swim Suit and Barefoot.", temperature);
                }
                break;
            case "Evening":
                if (temperature>=10 && temperature<=18) {
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", temperature);
                }else if (temperature>18&&temperature<=24){
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", temperature);
                }else {
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", temperature);
                }
                break;
        }

    }
}
*/