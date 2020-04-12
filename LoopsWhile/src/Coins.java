import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double change = Double.parseDouble(scan.nextLine());
        double money = Math.floor(change*100);
        int coins = 0;
        while (change>0){
            if (money-200>=0){
                money=money-200;
                coins++;
            }
            else if (money-100>=0){
                money=money-100;
                coins++;
            }
            else if (money-50>=0){
                money=money-50;
                coins++;
            } else if (money-5>=0){
                money=money-5;
                coins++;
            }
            else if(money-2>=0){
                money=money-2;
                coins++;
            }
            else if (money-1>=0){
                money=money-1;
                coins++;
            }
        }
        System.out.println(coins);
    }
}
