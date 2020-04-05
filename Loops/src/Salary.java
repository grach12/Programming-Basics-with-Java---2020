import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabs = Integer.parseInt(scan.nextLine());
        int salary = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < tabs ; i++) {
            String site = scan.nextLine();

            switch (site) {
                case "Facebook":
                    salary = salary - 150;
                    break;
                case "Instagram":
                    salary = salary - 100;
                    break;
                case "Reddit":
                    salary = salary - 50;
                    break;
            }
            if (salary <= 0) {
                System.out.printf("You lost your salary");
                break; //break чупи цикъла
            }
        }
          if (salary>=0){
            System.out.printf("%.2f", salary);
    }
}
}
