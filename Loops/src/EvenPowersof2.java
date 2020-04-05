import java.util.Scanner;

public class EvenPowersof2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int k = 1; //тук правим изчисленията

        for (int i = 0; i <=n ; i+=2) {
            System.out.println(k);
            k=k*2*2;
        }
    }
}
