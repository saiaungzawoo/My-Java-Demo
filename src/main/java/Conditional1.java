import java.util.Scanner;

public class Conditional1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int MinAge = 18;

        System.out.print("Enter your age: ");
        int input = scanner.nextInt();
        scanner.nextLine();

        if(input >= MinAge){
            System.out.println("You are eligible to vote.");
        }
        else {
            System.out.println("Sorry");
        }

        scanner.close();

    }
}
