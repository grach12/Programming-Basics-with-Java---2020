import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine())-1;
        String roomType = scan.nextLine();
        String value = scan.nextLine();

        double roomForone = days*18;
        double apartment = days*25;
        double presidentAp = days*35;

        switch (roomType) {
            case "room for one person":
                if (value.equals("positive")) {
                    roomForone *= 1.25;
                } else {
                    roomForone *= 0.9;
                }
                break;
            case "apartment":
                if (value.equals("positive") && (days < 10)) {
                    apartment *= 0.3;
                    apartment *= 1.25;
                } else if (value.equals("positive") && (days > 10) && (days < 15)) {
                    apartment *= 0.35;
                    apartment *= 1.25;}
                    else if ((value.equals("negative") && (days < 10))) {
                apartment *= 0.3;
                apartment *= 0.9;
                } else {
                    apartment *= 0.5;
                    apartment *= 1.25;
                }
                break;
            case "president apartment":
                if (value.equals("positive") && (days < 10)) {
                    apartment *= 0.1;
                    apartment *=1.25;
                } else if (value.equals("positive") && (days > 10) && (days < 15)) {
                    apartment *= 0.15;
                    apartment *= 1.25;
                } else {
                    apartment *= 0.2;
                    apartment *=1.25;
                }
                break;
        }


    }
}
