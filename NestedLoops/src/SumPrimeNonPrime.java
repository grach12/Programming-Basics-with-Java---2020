import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int primeSum = 0;
        int notPriSum = 0;
        String input = scan.nextLine();
        while (!"stop".equals(input)) {
            int num = Integer.parseInt(input);
            if (num<0){
                System.out.println("Number is negative.");//бновяваме za da nqmame bezkraen sled continue
                input = scan.nextLine();//о
                continue;
            }
            boolean flag = false;
            for (int i = 2; i <= num / 2; ++i) {
                // condition for nonprime number
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                // System.out.println(num + " is a prime number.");
                primeSum += num;
            } else {
                //  System.out.println(num + " is not a prime number.");
                notPriSum += num;
            }
            input = scan.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n",primeSum);
        System.out.printf("Sum of all non prime numbers is: %d%n",notPriSum);
    }
}