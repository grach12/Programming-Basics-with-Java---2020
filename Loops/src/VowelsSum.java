import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char symbol= input.charAt(i);

            switch (symbol){
                case 'a':
                    sum=sum+1;
                    break;
                case 'e':
                    sum=sum+2;
                    break;
                case 'o':
                    sum=sum+4;
                    break;
                case 'i':
                    sum=sum+3;
                    break;
                case 'u':
                    sum = sum+5;
            }
        }
        System.out.println(sum);
    }
}
