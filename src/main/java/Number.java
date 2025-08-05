import java.util.Scanner;

public class Number {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter grade one: ");
        double one = scanner.nextDouble();

        System.out.print("Enter grade two: ");
        double two = scanner.nextDouble();

        System.out.print("Enter grade three: ");
        double three = scanner.nextDouble();

        double total = (one + two + three) * 2;

        System.out.println("one is " + one);
        System.out.println("two is " + two);
        System.out.println("three is " + three);

        String formatTotal = String.format("%.3f", total);

        System.out.println("Total is " + formatTotal);

    }
}
