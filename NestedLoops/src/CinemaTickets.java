import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int studentCounter = 0;
        int standartCounter = 0;
        int kidCounter = 0;

        while (!"Finish".equals(input)) {
            int seatsCount = Integer.parseInt(scan.nextLine());
            int peopleCounter  = 0;
            for (int i = 0; i < seatsCount; i++) {
                String ticketType = scan.nextLine();
                if (ticketType.equals("End")) {
                    break;
                }

                peopleCounter ++;
                switch (ticketType) {
                    case "student":
                        studentCounter++;
                        break;
                    case "standard":
                        standartCounter++;
                        break;
                    case "kid":
                        kidCounter++;
                        break;
                }
            }
            double percent = peopleCounter  * 1.0 / seatsCount * 100;
            System.out.printf("%s - %.2f%% full.%n", input, percent);

            input = scan.nextLine();
        }

        int peopleCount = studentCounter + standartCounter + kidCounter;
        System.out.printf("Total tickets: %d%n", peopleCount);
        System.out.printf("%.2f%% student tickets.%n", studentCounter * 1.0 / peopleCount * 100);
        System.out.printf("%.2f%% standard tickets.%n", standartCounter * 1.0 / peopleCount * 100);
        System.out.printf("%.2f%% kids tickets.%n", kidCounter * 1.0 / peopleCount * 100);
    }
}


//   int totalMovieCount = 0; пробно решение от Вероника
//        while (!"Finish".equals(input)){
//            int freePlaces = Integer.parseInt(scan.nextLine());
//            int countTickt = 0;
//
//            String ticket = scan.nextLine();
//            while (!"End".equals(ticket)){ //standard
//            countTickt++;
//
//            if (countTickt>=freePlaces){
//                break;
//            }
//            countTickt++;
//
//                ticket=scan.nextLine();
//            }
//
//            double result = countTickt*1.0/freePlaces*1.0*100;
//            System.out.printf("%s - %.2f% full", input ,result );
//            input = scan.nextLine();
//        }