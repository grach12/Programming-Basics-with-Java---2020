import java.util.Scanner;

public class SumNumbersWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int sum = 0;

        while (!input.equals("Stop")){
            int number = Integer.parseInt(input);

            sum+=number;

            input=scan.nextLine();
        }
        System.out.println(sum);
    }
}
