import java.util.Scanner;

public class OnTimefortheExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hourExam = Integer.parseInt(scan.nextLine());
        int minExam = Integer.parseInt(scan.nextLine());
        int hourArrive = Integer.parseInt(scan.nextLine());
        int minArrive = Integer.parseInt(scan.nextLine());

        int allMinExam = hourExam*60+minExam;
        int allMinArrive = hourArrive*60+minArrive;

if (allMinArrive>allMinExam){
    System.out.print("Late");
}else if (allMinArrive-30<allMinExam){
    System.out.println("Early");
}else if (allMinArrive<allMinExam){
    System.out.println("On time");
}

if (allMinArrive-60<allMinArrive){
    System.out.printf("%d minutes before the start", allMinExam-allMinArrive);
}



    }
}
