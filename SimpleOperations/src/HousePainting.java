import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

            //WALLS
        double sideWall = x*y;
        double windows = 1.5*1.5;
        double frontWall = 2*sideWall-2*windows;
        double backWall = x*x;
        double entrance = 1.2*2;
        double backAndFront = 2*backWall-entrance;
        double totalArea = frontWall+backAndFront;
      //  System.out.println(totalArea);
        double greenPaint = totalArea/3.4;
        System.out.printf("%.2f%n", greenPaint);
            // ROOF
        double roofRectangles = 2*(x*y);
        double roofTriangles = 2*(x*h/2);
        double totalTrianArea = roofRectangles+roofTriangles;
        //System.out.println(totalTrianArea);
double redPaint = totalTrianArea/4.3;
        System.out.printf("%.2f", redPaint);

    }
}
