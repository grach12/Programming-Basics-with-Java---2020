import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double income = Double.parseDouble(scan.nextLine());
        double grade = Double.parseDouble(scan.nextLine());
        double salary = Double.parseDouble(scan.nextLine());

        double socialScholarship;
        double gradeScholarship;

        if(grade>=5.5){
            gradeScholarship = Math.floor(grade*25);
            System.out.printf("You get a scholarship for excellent results %.0f BGN", gradeScholarship);
        }
        else if ((income<salary)&&(grade>=4.5)){
            socialScholarship = Math.floor(salary*0.35);
            System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
        }
        else{
            System.out.println("You cannot get a scholarship!");
        }
    }
}
