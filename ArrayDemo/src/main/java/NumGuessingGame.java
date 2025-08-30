//watch video
//let chatgpt explain line by line tmr

import java.util.Random;
import java.util.Scanner;

public class NumGuessingGame {

    public static void main(String[] args) {

        System.out.println("NUMBER GUESSING GAME");
        System.out.println("You have five attempts.");

        System.out.println();

        int secretNum =  random();
        gameLoop(secretNum);


    }

    public static int random(){
        //init the game

        int upperBound = 10;

        //generate random number 1-10
        Random random = new Random();

        return random.nextInt(upperBound) + 1;
    }

    public static void gameLoop(int secretNum){

        Scanner scanner = new Scanner(System.in);

        int maxAttempts = 5;

        //since the user have not won
        boolean won = false;

        //loop until the user enters a correct number or if the max attempts is used.
        for (int i = maxAttempts; i > 0 ; i--) {

            System.out.print("Guess a number between 1 to 10: ");
            int guess = scanner.nextInt();

            won = guess == secretNum;

            if(won){
                System.out.println("Success!!! You guessed the secret number " + secretNum);
                break;
            }

            else {
                System.out.println("Sorry your guess is incorrect.");
            }
        }

        //
        if(!won){
            System.out.println("You did not win. The secret number is " + secretNum);
        }



        scanner.close();

    }
}
