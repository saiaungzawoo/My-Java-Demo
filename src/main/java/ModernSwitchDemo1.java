import java.util.Scanner;

public class ModernSwitchDemo1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the book type: ");
        String input = scanner.nextLine();

        input = input.toLowerCase();

        switch(input){
            case "blue book" -> System.out.println("This is a blue book.");
            case "red book" -> System.out.println("This is a red book.");
            case "yellow book" -> System.out.println("This is a yellow book.");
            default -> System.out.println("Unknown book.");

        }

        scanner.close();
    }
}
