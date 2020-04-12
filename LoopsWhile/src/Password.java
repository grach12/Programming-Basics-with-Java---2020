import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username = scan.nextLine();
        String password = scan.nextLine();

        String inputPassword = scan.nextLine();
int failedAttemd = 0;
        while (!inputPassword.equals(password)) {
            inputPassword = scan.nextLine();
          //  failedAttemd++;
        }
        System.out.printf("Welcome %s!", username);
      //  System.out.println(failedAttemd);
    }
}
