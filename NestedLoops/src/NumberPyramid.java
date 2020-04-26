import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int number = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(number + " ");
                number++;
                if (number > n) { // това  се прави с флаг , boolean flag = true; който се декларира преди циклите
                    break;
                }
            }
            if (number > n) {
                break;
            }
            System.out.println(); //пазен ред
        }
    }
}
