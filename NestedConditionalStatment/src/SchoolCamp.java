import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String season = scan.nextLine();
        String gender = scan.nextLine();
        int studentsCount = Integer.parseInt(scan.nextLine());
        int nights = Integer.parseInt(scan.nextLine());

        String sport = "";
        double priceNight=0.00;
        double priceAll = 0.00;

if (season.equals("Winter")&&(gender.equals("boys")||(gender.equals("girls")))) {
            priceNight = 9.6;
        }else if (season.equals("Spring")&&(gender.equals("boys")||(gender.equals("girls")))){
    priceNight = 7.20;
        }else if (season.equals("Summer")&&(gender.equals("boys")||(gender.equals("girls")))){
    priceNight = 15;
        }else if (season.equals("Winter")&&(gender.equals("mixed"))){
    priceNight=10;
        }else if (season.equals("Spring")&&(gender.equals("mixed"))){
    priceNight=9.50;
        }else if (season.equals("Summer")&&(gender.equals("mixed"))){
    priceNight=20;
        }

if (studentsCount>=50){
    priceNight*=0.50;
}else if ((studentsCount>=20)&&(studentsCount<=50)){
    priceNight*=0.75;
}else if ((studentsCount>=10)&&(studentsCount<=20)){
    priceNight*=0.95;
}

    }
}
