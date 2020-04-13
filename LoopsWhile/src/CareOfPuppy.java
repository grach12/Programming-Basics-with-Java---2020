import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int food = Integer.parseInt(scan.nextLine()) * 1000;
        String adopt = scan.nextLine();

        while (!"Adopted".equals(adopt)) {
            int eat = Integer.parseInt(adopt);
            food = food - eat;
            // if (food < 0) {
            //   break;
            //}
            adopt = scan.nextLine();
        }
        if (food < 0) {
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(food));
        } else {
            System.out.printf("Food is enough! Leftovers: %d grams.", Math.abs(food));
        }
    }
}