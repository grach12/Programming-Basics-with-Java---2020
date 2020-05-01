import java.util.Scanner;

public class NikolaTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String input2 = scan.nextLine();

        int sum = 0;

        while (!"end".equals(input)){
            int a = Integer.parseInt(input);
            int b = Integer.parseInt(input2);
            sum=sum+(a*b);
            input=scan.nextLine();
            }
        System.out.println(sum);
        }
    }



//    Я една задачка:
//        Вкарва се число a или end
//        Ако е число:
//        Вкарва се второ число b или end
//        Ако пак е число
//        sum = sum + a * b
//        като дейде end - да се отпечата sum
//        с брейк и без брейк