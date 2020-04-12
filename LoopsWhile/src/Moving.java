import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int lenght = Integer.parseInt(scan.nextLine());
        int high = Integer.parseInt(scan.nextLine());

        int totatalSpace = width * lenght * high;

        String input = scan.nextLine();
        while (!input.equals("Done")) {
            int boxes = Integer.parseInt(input);
            totatalSpace -= boxes;
            if (totatalSpace < 0) {
                break;
            }
            input = scan.nextLine();
        }
        if (totatalSpace < 0) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(totatalSpace));
        } else {
            System.out.printf("%d Cubic meters left.", totatalSpace);
        }
    }
}
