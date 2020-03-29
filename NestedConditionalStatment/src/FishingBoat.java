import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int budget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int fisherman = Integer.parseInt(scan.nextLine());

        double price = 0;

        switch (season){
            case "Spring":
                break;
        }
if (fisherman%2==0&&!season.equals("Autumns")){
    price=price*0.95;
}
if (price>budget){
    double moneyNeed = price-budget;
}
else {
    double moneyLeft = budget-price;
    System.out.printf("Yes");
}
    }
}
