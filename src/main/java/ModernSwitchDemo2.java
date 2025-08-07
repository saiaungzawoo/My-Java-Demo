import java.util.Scanner;

public class ModernSwitchDemo2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the book type: ");
        String input = scanner.nextLine();

        input = input.toLowerCase();

        String display = switch (input){
            case "blue book" -> "This is a blue book.";
            case "red book" -> "This is a red book.";
            case "yellow book" -> "This is a yellow book.";
            default -> "Unknown book.";

        };

        System.out.println(display);

        scanner.close();
    }
}
