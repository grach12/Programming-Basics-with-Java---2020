import java.util.Scanner;

public class Debug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        if (input.equals("Ivan")){
            System.out.println("My name is Ivan");
        }
        else  if(input.equals("Petar")){
            System.out.println("Petar");
        }
        System.out.println("Im here");
    }
}
