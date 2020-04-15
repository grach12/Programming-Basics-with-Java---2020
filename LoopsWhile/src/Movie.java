import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sumPeople = 0;
        double sumPeopleThree = 0;
        double sumIncome = 0;
        double sumIncomeThree = 0;

        int hallCapacity = Integer.parseInt(scan.nextLine());

        String readtext = scan.nextLine();
        while (!"Movie time!".equals(readtext)) {
            int people = Integer.parseInt(readtext);
            sumPeople += people;
            if (sumPeople > hallCapacity) {
                break;
            }
            sumIncome = sumPeople * 5;

            if (people % 3 == 0) {
                sumPeopleThree += people;
                sumIncomeThree -= 5;
            }
            readtext = scan.nextLine();
        }

        if (sumPeople > hallCapacity) {
            System.out.println("The cinema is full.");
        } else if (sumPeople <= hallCapacity) {
            System.out.printf("There are %.0f seats left in the cinema.%n", hallCapacity - sumPeople);
        }
        System.out.printf("Cinema income - %.0f lv.", sumIncome + sumIncomeThree);

    }
}
