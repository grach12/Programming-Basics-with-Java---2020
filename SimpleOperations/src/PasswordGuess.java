import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        if (input.equals("s3cr3t!P@ssw0rd")){
            System.out.println("Welcome");
        }
        else {
            System.out.println("Wrong password!");
        }
    }
}
