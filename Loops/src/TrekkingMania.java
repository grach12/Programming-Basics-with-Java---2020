import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int groups = Integer.parseInt(scan.nextLine());

        int allClimbers = 0;
        double musala = 0;
        double monblan = 0;
        double kilim = 0;
        double k2 =0;
        double everest = 0;


        for (int i = 1; i <=groups ; i++) {
            int climbers = Integer.parseInt(scan.nextLine());
            allClimbers=allClimbers+climbers;

if (climbers<=5){
    musala=musala+climbers;
}else if (climbers<=12){
    monblan+=climbers;
}else if (climbers<=25){
    kilim+=climbers;
}else if (climbers<=40){
    k2+=climbers;
}else {
    everest+=climbers;
}
        }
       // System.out.println(allClimbers);

        System.out.printf("%.2f%%%n",musala/allClimbers*100);
        System.out.printf("%.2f%%%n",monblan/allClimbers*100);
        System.out.printf("%.2f%%%n",kilim/allClimbers*100);
        System.out.printf("%.2f%%%n",k2/allClimbers*100);
        System.out.printf("%.2f%%",everest/allClimbers*100);
    }
}
