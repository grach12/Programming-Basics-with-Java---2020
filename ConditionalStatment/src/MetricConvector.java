import java.util.Scanner;

public class MetricConvector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double toConvert = Double.parseDouble(scan.nextLine());
        String input = scan.nextLine();
        String output = scan.nextLine();

        if (input.equals("mm")){
            toConvert=toConvert/1000;
        }
        else  if (input.equals("cm")){
            toConvert= toConvert/100;
        }

        if (output.equals("mm")) {
            toConvert = toConvert * 1000;
        } else if (output.equals("cm")) {
            toConvert = toConvert * 100;
        }
        System.out.printf("%.3f", toConvert);
    }
}
