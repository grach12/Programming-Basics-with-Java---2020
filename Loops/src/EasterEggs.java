import java.util.Scanner;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());


        int red = 0;
        int orange = 0;
        int blue = 0;
        int green = 0;
        int maxEggs = 0;
        String maxColor ="";

        for (int i = 0; i < n; i++) {
           String color = scan.nextLine();

            switch (color) {
                case "red":
                    red++;
                    break;
                case "orange":
                    orange++;
                    break;
                case "blue":
                    blue++;
                    break;
                case "green":
                    green++;
                    break;
            }
            if (red>maxEggs){
                maxEggs=red;
                maxColor=" -> red";
            }else if (orange>maxEggs){
                maxEggs=orange;
                maxColor=" -> orange";
            }else if (blue>maxEggs){
                maxEggs=blue;
                maxColor=" -> blue";
            }else if (green>maxEggs){
                maxEggs=green;
                maxColor=" -> green";
            }

        }
        System.out.println("Red eggs: " +red);
        System.out.println("Orange eggs: "+orange);
        System.out.println("Blue eggs: "+blue);
        System.out.println("Green eggs: "+green);
        System.out.println("Max eggs: "+maxEggs+maxColor);
    }
}
