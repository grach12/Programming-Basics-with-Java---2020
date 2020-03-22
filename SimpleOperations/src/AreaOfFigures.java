import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String form = scan.nextLine();

        double area = 0;


        if (form.equals("square")){
            double side = Double.parseDouble(scan.nextLine());
            area=side*side;
        }
        else if (form.equals("circle")){
            double radius = Double.parseDouble(scan.nextLine());
            area = Math.PI*radius*radius;
        }
        else  if (form.equals("rectangle")){
            double wide = Double.parseDouble(scan.nextLine());
            double lenght = Double.parseDouble(scan.nextLine());
            area= wide*lenght;
        }
        else if (form.equals("triangle")){
            double lenght = Double.parseDouble(scan.nextLine());
            double base = Double.parseDouble(scan.nextLine());
            area= (lenght*base)/2;
        }

        System.out.printf("%.3f",area);

//        String currentDay = "Monday";
//        if (currentDay.equals("Monday")) {
//            double salary = Double.parseDouble(scan.nextLine());
//            System.out.println(salary);
//        }

    }
}
