import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age = Integer.parseInt(scan.nextLine());
        double priceLaundry = Double.parseDouble(scan.nextLine());
        int priceToy = Integer.parseInt(scan.nextLine());

        int sum = 0;
        int evenMoney = 0;

        int counter = 0;
        for (int i = 1; i <= age; i++) {

            if (i % 2 ==0){
                evenMoney=evenMoney+10;
                sum= sum+evenMoney;
                counter=counter+1;
               // double money = Double.parseDouble(scan.nextLine());
            }else {
                sum=sum+priceToy;
            }
        }
     //   System.out.println(sum);
       // System.out.println(counter);
        double savedMoney = sum-counter;

        double diff = Math.abs(savedMoney-priceLaundry);

        if (savedMoney>=priceLaundry){
            System.out.printf("Yes! %.2f", diff );
        }else {
            System.out.printf("No! %.2f", diff);
        }
    }
}
