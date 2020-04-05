import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
int sum = 0;
int max = Integer.MIN_VALUE;
        for (int i = 0; i < n ; i++) {
            int num = Integer.parseInt(scan.nextLine());
            sum = sum+num;
            if (num>max){
                num=max;
            }
        }
        sum=sum-max;
        if (sum==max){
            System.out.println("Yes");
            System.out.println("Sum = %d"+sum);
        }else {
            int diff = sum-max;
            System.out.println("No");
            System.out.println("Diff = %d"+Math.abs(diff));
        }
    }
}
