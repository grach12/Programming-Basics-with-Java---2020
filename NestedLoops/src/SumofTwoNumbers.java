import java.util.Scanner;

public class SumofTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());
        int magic = Integer.parseInt(scan.nextLine());

        boolean flag = false;
        int counter = 0;
        for (int i = n; i <= m; i++) {
            {
                for (int j = n; j <= m; j++) {
                    counter++;
                    int sum = i+j;
                    if (sum == magic) {
                        System.out.printf("Combination N:%d (%d + %d = %d)%n",counter, i, j, sum);
                        flag = true;
                        break;
                    }
                }
                if (flag==true) {
                    break;
                }
            }
        }
        if (flag==false) {
            System.out.printf("%d combinations - neither equals %d", counter, magic);
        }
    }
}
