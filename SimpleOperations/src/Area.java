import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
String input = scan.nextLine();
        int a = Integer.parseInt(input);

        int area = a*a;

        System.out.println(area);
    }
}
