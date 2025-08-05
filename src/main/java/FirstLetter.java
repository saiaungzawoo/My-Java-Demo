import java.util.Scanner;

public class FirstLetter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("I will print first and last character of your word");
        System.out.print("Enter any word: ");
        String input = scanner.nextLine();

        String first = input.substring(0,1);
        String last = input.substring(input.length() - 1);
        String length = String.valueOf(input.length());

        System.out.println("First character: " + first);
        System.out.println("Last character: " + last);
        System.out.println("Word length: " + length);

        scanner.close();

    }
}
