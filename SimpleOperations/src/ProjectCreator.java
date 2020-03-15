import java.util.Scanner;

public class ProjectCreator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int projects = Integer.parseInt(scan.nextLine());

        System.out.printf("The architect %s" +
                " will need %d hours to " +
                "complete %d project/s.", name,projects*3,  projects);
    }
}
