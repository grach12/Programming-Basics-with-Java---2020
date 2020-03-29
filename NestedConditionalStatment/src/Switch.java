import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        switch (num) {
            case 5:
                System.out.println("Number i five");
                break;
            case  7:
                    System.out.println("Number is 7");
                    break;
        }
    }
}
