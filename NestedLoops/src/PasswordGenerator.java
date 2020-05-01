import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int l = Integer.parseInt(scan.nextLine());

        for (int i = 1; i < n; i++) { //symbol 1
            for (int j = 1; j < n; j++) { //symbol2
                for (char k = 'a'; k < 'a' + l; k++) {
                    for (char m = 'a'; m < 'a' + l; m++) {
                        for (int o = 1; o <= n; o++) { //symbol 5
                            if ( o > i && o > j)
                            {
                            System.out.printf("%d%d%c%c%d ", i, j, k, m, o);}
                        }
                    }
                }
            }
        }
    }
}
