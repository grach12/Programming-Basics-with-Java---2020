import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String data = scan.nextLine();

        int totalSteps = 0;

        while (totalSteps<10000) {
            String input = scan.nextLine();
            if ("Going home".equals(input)) {
                int stepsTohome = Integer.parseInt(scan.nextLine());
                totalSteps +=stepsTohome;
                break;
            }
            int currenSteps = Integer.parseInt(input);
            totalSteps = totalSteps + currenSteps;
            if (totalSteps>=10000){
                break;
            }
        }


if (totalSteps>=10000){
    System.out.println("Goal reached! Good job!");

}else{
    int diff = 10000 - totalSteps;
    System.out.printf("%d more steps to reach goal.", diff);
}
    }
}
