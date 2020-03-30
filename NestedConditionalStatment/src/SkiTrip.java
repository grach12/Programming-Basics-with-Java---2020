import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine()) - 1;
        String roomType = scan.nextLine();
        String value = scan.nextLine();

        double roomForOne = days * 18;
        double apartment = days * 25;
        double presidentAp = days * 35;

        switch (roomType) {
            case "room for one person":
                if (value.equals("positive")) {
                    roomForOne *= 1.25;
                } else {
                    roomForOne *= 0.9;
                }
                break;
            case "apartment":
                if (value.equals("positive") && (days < 10)) {
                    apartment *= 0.7;
                    apartment *= 1.25;
                } else if (value.equals("positive") && (days > 10) && (days < 15)) {
                    apartment *= 0.65;
                    apartment *= 1.25;
                } else if ((value.equals("negative") && (days < 10))) {
                    apartment *= 0.3;
                    apartment *= 0.9;
                } else if (value.equals("negative") && (days > 10) && (days < 15)) {
                    apartment *= 0.5;
                    apartment *= 0.9;
                } else if ((days > 15) && value.equals("positive")) {
                    apartment *= 0.5;
                    apartment *= 1.25;
                } else if ((days > 15) && value.equals("negative")) {
                    apartment *= 0.5;
                    apartment *= 0.9;
                }
                break;
            case "president apartment":
                if (value.equals("positive") && (days < 10)) {
                    presidentAp *= 0.9;
                    presidentAp *= 1.25;
                } else if (value.equals("positive") && (days > 10) && (days < 15)) {
                    presidentAp *= 0.85;
                    presidentAp *= 1.25;
                } else if (value.equals("positive") && (days > 15)) {
                    presidentAp *= 0.8;
                    presidentAp *= 1.25;
                }
                if (value.equals("negative") && (days < 10)) {
                    presidentAp *= 0.9;
                    presidentAp *= 0.9;
                } else if (value.equals("negative") && (days > 10) && (days < 15)) {
                    presidentAp *= 0.85;
                    presidentAp *= 0.9;
                } else if (value.equals("negative") && (days > 15)) {
                    presidentAp *= 0.8;
                    presidentAp *= 0.9;
                }

                break;
        }
        switch (roomType) {
            case "room for one person":
                System.out.printf("%.2f", roomForOne);
                break;
            case "apartment":
                System.out.printf("%.2f", apartment);
                break;
            case "president apartment":
                System.out.printf("%.2f", presidentAp);
                break;
        }

    }
}
