import java.util.Scanner;

public class MaxNymberWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int i=0;
        int maxNum = Integer.MIN_VALUE;
        while (i<n){
            int num = Integer.parseInt(scan.nextLine());
            if (num>maxNum){
                maxNum=num;
            }
            i++;
        }
        System.out.println(maxNum);
    }
}
