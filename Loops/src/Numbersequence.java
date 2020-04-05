import java.util.Scanner;

public class Numbersequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scan.nextLine());

            if(currentNum>maxNum){
                maxNum=currentNum;
            }
            if (currentNum<minNum){
                minNum=currentNum;
            }
        }
        System.out.println("Max number: "+maxNum);
        System.out.println("Min number: "+minNum);
    }
}
