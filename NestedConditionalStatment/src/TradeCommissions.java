import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String city = scan.nextLine();
        double sells = Double.parseDouble(scan.nextLine());


        //      System.out.println(sells * 0.08);

        switch (city) {
            case "Sofia":
                if (sells <= 500 && sells >= 0) {
                    System.out.printf("%.2f", sells * 0.05);

                } else if (sells > 500 && sells <= 1000) {
                    System.out.printf("%.2f", sells * 0.07);

                } else if (sells >= 1000 & sells <= 10000) {
                    System.out.printf("%.2f", sells * 0.08);

                } else if (sells > 10000) {
                    System.out.printf("%.2f", sells * 0.12);

                } else {
                    System.out.println("error");
                }
                break;

            case "Plovdiv":
                if (sells <= 500 && sells >= 0) {
                    System.out.printf("%.2f", sells * 0.055);

                } else if (sells > 500 && sells <= 1000) {
                    System.out.printf("%.2f", sells * 0.08);

                } else if (sells >= 1000 & sells <= 10000) {
                    System.out.printf("%.2f", sells * 0.12);

                } else if (sells > 10000) {
                    System.out.printf("%.2f", sells * 0.145);

                } else {
                    System.out.println("error");
                }
                break;
            case "Varna":
                if (sells <= 500 && sells >= 0) {
                    System.out.printf("%.2f", sells * 0.045);

                } else if (sells > 500 && sells <= 1000) {
                    System.out.printf("%.2f", sells * 0.075);

                } else if (sells >= 1000 & sells <= 10000) {
                    System.out.printf("%.2f", sells * 0.1);

                } else if (sells > 10000) {
                    System.out.printf("%.2f", sells * 0.13);

                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
        }


    }
}
