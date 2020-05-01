import java.util.Scanner;

public class NikolaTAsks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        if (n>=1000 && n<=2000){
              String h = ""+n;

        String input = h;
        int m = input.length();

       // System.out.println(m);
        int counter = 0;

        int sum=0;
        for (int i = 0; i < m ; i++) {
           // String currentNum = "" + i;
            int currentDigit = Integer.parseInt("" + input.charAt(i));


            sum+=currentDigit;
        }
        System.out.println(sum);
    }
        else {
            System.out.println("Error");
        }

    }
}

