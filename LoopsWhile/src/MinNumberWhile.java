import java.util.Scanner;

public class MinNumberWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int i=0;
        int minNum = Integer.MAX_VALUE;
        while (i<n){
            int num = Integer.parseInt(scan.nextLine());
            if (num<minNum){
                minNum=num;
            }
            i++;
        }
        System.out.println(minNum);
    }
}
