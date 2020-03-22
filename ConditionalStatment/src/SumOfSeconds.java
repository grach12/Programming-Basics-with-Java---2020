import java.util.Scanner;

public class SumOfSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int secFirst = Integer.parseInt(scan.nextLine());
        int secSecond = Integer.parseInt(scan.nextLine());
        int secThird = Integer.parseInt(scan.nextLine());

        int totalSeconds = secFirst+secSecond+secThird;

        int minutes = totalSeconds/60; // делим целочислено
        int seconds = totalSeconds%60; // за да извадим остатъка

if (seconds<10){
    System.out.printf("%d:0%d" , minutes, seconds);
}
else {
    System.out.printf("%d:%d", minutes, seconds);
}

    }
}
