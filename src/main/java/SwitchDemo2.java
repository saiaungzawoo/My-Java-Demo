import java.util.Scanner;

public class SwitchDemo2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your ticket number: ");
        int input = scanner.nextInt();

        System.out.println("Your ticket number: " + input);

        switch(input){
            case 1:
            case 2:
            case 3:
                System.out.println("G-1");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("G-2");
                break;
            default:
                System.out.println("Unknown data.");

        }


        scanner.close();
    }
}
