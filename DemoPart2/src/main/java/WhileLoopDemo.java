import java.util.Scanner;

public class WhileLoopDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean done = false;

        while (!done) {

            System.out.println("Hi.");

            System.out.print("Are you done? Y/N: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Y")){
                done = true;

            }
        }

        scanner.close();
    }
}
