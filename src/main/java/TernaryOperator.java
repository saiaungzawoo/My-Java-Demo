import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int MinAge = 18;

        System.out.print("Enter your age: ");
        int input = scanner.nextInt();
        scanner.nextLine();

        String message = (input >= MinAge) ? "You are eligible to vote." : "Sorry, you are not eligible to vote.";
        System.out.println(message);
        scanner.close();
}}
