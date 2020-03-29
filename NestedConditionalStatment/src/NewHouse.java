import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String flowersType = scan.nextLine();
        int flowersCount = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());
double price =0;
        switch (flowersType){
            case "Roses":
                price = flowersCount*5;
                if (flowersCount>50){
                    price*=0.9;
                }
                break;

            case "Dahlias":
                price = flowersCount*3.8;
                if(flowersCount>90){
                    price*=0.85;
            }break;

            case "Narcissus":
                price *= 3;
                if (flowersCount>120){
                    price*=1.15;
                }break;
            case "Gladiolus":
                price*=2.5;
                if (flowersCount>80){
                    price*=1.2;
                }
                break;

        }
        if (price>budget){
            double moneyNeed = price- budget;
            System.out.printf(" ",price-budget);
        }
else {

        }
    }
}
