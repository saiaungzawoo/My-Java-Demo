import java.util.Scanner;

public class Stringinput {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        //output the user's input in Uppercase
        System.out.print("What is your fav food? ");
        String input = read.nextLine();
        String input1 = input.toUpperCase();
        System.out.println("Your fav food is " + input1);

        read.close();

        //not a good practice
      //  System.out.println("Your fav food is " + input.toUpperCase());//
        /*
        System.out.print("What is your fav book? ");
        String Input = read.nextLine();
        System.out.println("Your fav food is " + Input.toUpperCase());

         */


    }
}
