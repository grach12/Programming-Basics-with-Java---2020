import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input  = scan.nextLine();
   //     input = input.replaceAll("[^\\p{ASCII}]", "");

        while (!"End".equals(input)){
             char n  = input.charAt(0);
             if (!((n<32) || (n>127))){





            }




            System.out.println(n);



            input= scan.nextLine();
        }

        System.out.println(input);
    }
}
