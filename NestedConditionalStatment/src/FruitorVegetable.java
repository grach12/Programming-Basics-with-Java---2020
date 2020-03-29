import java.util.Scanner;

public class FruitorVegetable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();

        if (product.matches("banana|apple|kiwi|cherry|lemon|grapes")) {
            System.out.println("fruit");
        } else if (product.matches("tomato|cucumber|pepper|carrot")) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}
/*switch (product){
    case "banana":
    case "apple":
    case "kiwi":
    case "cherry":
    case "lemon":
    case "grapes":
        System.out.println("fruit");
        break;
    case "tomato":
    case "cucumber":
    case "pepper":
    case "carrot":
        System.out.println("vegetable");
        break;
    default:
        System.out.println("unknown");
}

    }
}
*/