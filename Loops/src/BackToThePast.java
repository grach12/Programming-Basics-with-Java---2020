import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double money = Double.parseDouble(scan.nextLine());
        int year = Integer.parseInt(scan.nextLine());

        double moneyToleave = 0;

        for (int i = 0; i <= year - 1800; i++) {
            //  System.out.println(i);
            //moneyToleave = money; //така не се прави това се нулира всеки път.
            if (i % 2 == 0) {
                moneyToleave = moneyToleave - 12000;
            }
            if (!(i % 2 == 0)) {
                moneyToleave = moneyToleave - (12000 + 50 * (18 + i));
            }
        }
        double moneyRest = money + moneyToleave;
        if (moneyRest >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", moneyRest);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(moneyRest));
        }
        //  System.out.println(moneyToleave);
        //  System.out.println(money);
        //  System.out.println(money + moneyToleave);
    }
}

//        double money = Double.parseDouble(scan.nextLine());
//        int year = Integer.parseInt(scan.nextLine());
//
//        double moneyTolive=0;
//
//        for (int i = 0; i <=year-1800 ; i++) {
//            double evenYearExpence = 12000;
//            double oddYearExpence = (12000+50*(18+i));;
//
//
//            if (i%2==0){
//                moneyTolive=moneyTolive-evenYearExpence;
//            }
//            if (!(i%2== 0)) {
//                moneyTolive=moneyTolive-oddYearExpence;
//            }
//        }System.out.println(money-moneyTolive);
//        //System.out.println(money);
//    }
//}
//
