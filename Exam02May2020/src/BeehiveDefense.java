import java.util.Scanner;

public class BeehiveDefense {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int bee = Integer.parseInt(scan.nextLine());
        double healthBear = Double.parseDouble(scan.nextLine());
        int attackBear = Integer.parseInt(scan.nextLine());

        while (bee>=100){

            bee=bee-attackBear;
            if (bee<0){
                bee=0;
            }
            healthBear=healthBear-bee*5;

            if (healthBear<=0){
                break;
            }

        }
        if (healthBear<=0){
            System.out.printf("Beehive won! Bees left %d.", bee);
        }else{
            System.out.printf("The bear stole the honey. Bees left %d.",bee);
        }
    }
}
