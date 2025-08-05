import java.util.Scanner;

public class Conditional2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int MinOrderCount = 2;
        int MaxOrderCount = 10;

        System.out.print("Please enter your order count: ");
        int input = scanner.nextInt();

        System.out.println();

        boolean logic = input >= MinOrderCount && input <= MaxOrderCount;
        boolean evenORodd = (input % 2) == 0;

        if(logic) {
            System.out.println("Your Order count is in recommended range.");

            if(evenORodd){
                System.out.println("Your Order count is an even number.");
            }
            else {
                System.out.println("Your Order count is an odd number.");
            }
        }
        else {
            System.out.println("Your Order is out of range.");
        }

        scanner.close();
    }
}
