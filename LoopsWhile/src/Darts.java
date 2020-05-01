import java.util.Scanner;

public class Darts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startPoints = 301;
        String playerName = scan.nextLine();

        String command = "";
int counter = 0;
        while (!"Retire".equals(command)){
            command = scan.nextLine();
            int newPoints = Integer.parseInt(command);
            if (newPoints>startPoints){
                continue;
            }

            switch (command){
                case "Single":
                    startPoints-=newPoints;break;
                case "Double":
                    startPoints-=newPoints*2;break;
                case "Triple":
                    startPoints-=newPoints*3;break;
            }
            counter++;
           // command = scan.nextLine();
        }

        System.out.println(playerName+counter);


    }
}
