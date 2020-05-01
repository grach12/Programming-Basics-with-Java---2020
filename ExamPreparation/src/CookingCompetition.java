import java.util.Scanner;

public class CookingCompetition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int bakers = Integer.parseInt(scan.nextLine());
        double price=0;
        double sum = 0;

        for (int i = 0; i < bakers ; i++) {
            String nameBaker = scan.nextLine();
            String input = scan.nextLine(); // cookies cakes waffels
while (!"Stop baking!".equals(input)){
    //input = scan.nextLine();
    int num = Integer.parseInt(scan.nextLine());






    sum+=num;
    input=scan.nextLine();

}


        }
        System.out.println(sum);
    }
}
