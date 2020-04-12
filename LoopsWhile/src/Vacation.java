import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double target = Double.parseDouble(scan.nextLine());
        double startMoney = Double.parseDouble(scan.nextLine());
int spendCounter =0;
int daysCounter =0;
while (startMoney<target){
    String activity = scan.nextLine();
    double money = Double.parseDouble(scan.nextLine());
    if ("spend".equals(activity)){

        if (startMoney-money>0){
            startMoney=startMoney-money;
        }else  {
            startMoney=0;
        }
        spendCounter++;
        if (spendCounter==5){
            break;
        }
    }
    else if ("save".equals(activity)){
        startMoney=startMoney+money;
        spendCounter=0;
    }
}
if (spendCounter==5){
    System.out.printf("You cant save money");
    System.out.println(daysCounter);
}else {
    System.out.printf("You saved", daysCounter);
}
    }
}