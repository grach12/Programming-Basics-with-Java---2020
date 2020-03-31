import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int yangCount = Integer.parseInt(scan.nextLine());
        int oldCount = Integer.parseInt(scan.nextLine());
        String trace = scan.nextLine();

double taxYang = 0;
double taxOld = 0;

switch (trace){
    case "trail":
       taxYang = 5.50;
       taxOld = 7;break;
    case "cross-country":
        taxYang =8;
        taxOld= 9.5;
        if ((yangCount+oldCount)>=50){
            taxYang =8*0.75;
            taxOld= 9.5*0.75;
        }
        break;
    case "downhill":
        taxYang= 12.25;
        taxOld= 13.75;break;
    case "road":
        taxYang=20;
        taxOld=21.50;break;
}
        System.out.printf("%.2f", (yangCount*taxYang+oldCount*taxOld)*0.95);
    }
}
