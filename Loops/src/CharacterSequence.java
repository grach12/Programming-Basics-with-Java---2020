import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
     //   char letter = scan.char(a);
       int length = input.length(); //взимаме дължината на думата
     //   System.out.println(lenght);

        for (int i = 0; i < length; i++) {
            System.out.println(input.charAt(i));
        }

    }
}
