import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double score = 0 ;

        if (n<=100){
            score = 5;
        }
        else if (n<1000){
            score=n*0.2;
        }
        else if (n>1000){
            score=n*0.1;
        }

        if (n%2==0){
            score=score+1;
        }
        if (n%10==5){// За да проверите дали едно число завършва на 5 трябва да разделите числото на 10 и ако получите остатък при делението 5, то значи числото завършва на 5
            score=score+2;
        }
        System.out.println(score);
        System.out.println(score+n);
    }
}
