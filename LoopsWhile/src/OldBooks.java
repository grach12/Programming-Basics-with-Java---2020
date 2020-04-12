import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String bookName = scan.nextLine();
        int libraryCapacity = Integer.parseInt(scan.nextLine());

        String currentBook = "";
        int count = 0;

        boolean isFound = false;

        while (!isFound&&libraryCapacity>count){
            currentBook = scan.nextLine();
            if (currentBook.equals(bookName)){
                isFound = true;
            }else {
                count++;
            }
        }
        if (isFound){
            System.out.printf("You checked %d books and found it.", count);
        }else{
            System.out.printf("The book you search is not here!%nYou checked %d books.", count);
        }
    }
}

/*
        String book = scan.nextLine();
        int  bookToSearch= Integer.parseInt(scan.nextLine());
        String bookTosearch="";
        int counter=0;
        boolean notFound = false;
        while (!bookTosearch.equals(book)){
           book = scan.nextLine();
            if (counter<bookToSearch){
                notFound=true;
                break;
            }
        }counter++;
        if (notFound=true){
            System.out.printf("The book you search is not here!%n" +
                    "You checked %d books.", counter);
        }
        else{
            System.out.printf("You checked %d books and found it.", counter);
        }
    }
}*/
