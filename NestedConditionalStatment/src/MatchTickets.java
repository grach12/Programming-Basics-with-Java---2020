import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String vipOrNormal = scan.nextLine();
        int peopleGroup = Integer.parseInt(scan.nextLine());

        double vip = 499.99;
        double normal = 249.99;

        double transport = 0;

        if ((peopleGroup >= 1) && (peopleGroup <= 4)) {
            transport = budget * 0.25;
            // System.out.println(transport);
        } else if ((peopleGroup >= 5) && (peopleGroup <= 9)) {
            transport = budget * 0.4;
        } else if ((peopleGroup >= 10) && (peopleGroup <= 24)) {
            transport = budget * 0.5;
        } else if ((peopleGroup >= 25) && (peopleGroup <= 49)) {
            transport = budget * 0.6;
        } else if (peopleGroup >= 50) {
            transport = budget * 0.75;
        }
        if (vipOrNormal.equals("VIP") && (transport >= vip * peopleGroup)) {
            System.out.printf("Yes! You have %.2f leva left.", transport - vip * peopleGroup);
        } else if (vipOrNormal.equals("Normal") && (transport >= normal * peopleGroup)) {
            System.out.printf("Yes! You have %.2f leva left.", transport - normal * peopleGroup);

        } else if (vipOrNormal.equals("VIP") && (transport < vip * peopleGroup)) {
            System.out.printf("Not enough money! You need %.2f leva.", vip * peopleGroup - transport);
        } else if (vipOrNormal.equals("Normal") && (transport < normal * peopleGroup)) {
            System.out.printf("Not enough money! You need %.2f leva.", normal * peopleGroup - transport);
        }
    }
}