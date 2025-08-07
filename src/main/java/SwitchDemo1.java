import java.util.Scanner;

public class SwitchDemo1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a food type: ");
        String food = scanner.nextLine();

        food = food.toLowerCase();

        switch(food) {
            case "pizza":
                System.out.println("This is a pizza.");
                break;
            case "cookie":
                System.out.println("This is a cookie.");
                break;
            case "cake":
                System.out.println("This is a cake.");
                break;
            default:
                System.out.println("Unknown food.");

        }
        scanner.close();
    }
}
