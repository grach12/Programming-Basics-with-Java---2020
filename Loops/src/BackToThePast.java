import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double money = Double.parseDouble(scan.nextLine());
        int year = Integer.parseInt(scan.nextLine());

        double moneyToLive = 12000;

        for (int i = 0; i <year ; i++) {
            if (year%2==0){
                money=money-12000;
            }
            else {
                money=money-1200+50*(18+year);
            }
             money=money-moneyToLive ;

             if (money<=0){
                 System.out.printf("He will need 12399.85 %.2f dollars to survive.",money);
                 break;
             }

        }
    }
}

