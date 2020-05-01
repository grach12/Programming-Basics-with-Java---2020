import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input  = scan.nextLine();
   //   input = input.replaceAll("[^\\p{ASCII}]", "");

      //  int marked=0;
        int counter = 0;

        while (!"End".equals(input)){
             char n  = input.charAt(0);
             if (!((n<32) || (n>127))){

                 switch (n) {
                     case 'c':counter++;
                         if (counter < 1) {
                             System.out.print("%n");
                         }
                         break;
                     case 'o':counter++;if (counter > 1) {
                         System.out.println(n);
                     }break;
                     case 'n':counter++;if (counter > 1) {
                         System.out.println(n);
                     }break;
                 }
System.out.println(input);


            }




         //   System.out.println(input);



            input= scan.nextLine();
        }

      //  System.out.println(input);
    }
}
