import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WordQuestGamev2 {

    public static void main(String[] args) throws IOException {

        //read data from a file - no longer hard coded
        String fileName = "data/sample-words.txt";

        //define the secret word, max allowed attempts

        String secretWord = getRandomWord(fileName);

        int maxAttempts = 10;

        //create a game board with underscores to represent unrevealed letters
        //it will create underscores according to the lengths of random word
        char[] gameBoard = new char[secretWord.length()];

        //init a game board with underscores to represent unrevealed letters
        final char PLACEHOLDER = '-'; //final means constant - fixed value
        Arrays.fill(gameBoard, PLACEHOLDER);

        //scanner to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Word Quest!");

        //flag to check if the word has been fully revealed
        boolean hasMissingLetters = true;

        //main game loop: it runs while there are attempts left and the word is not fully revealed
        while(maxAttempts > 0 && hasMissingLetters){

            System.out.print("Current Word: ");
            System.out.println(gameBoard);

            System.out.println();

            System.out.print("Guess a letter: ");

            //read the user input, convert the first character to upper case
            String userInput = scanner.next().toUpperCase(); //use next() cuz we are reading a word
            char guess = userInput.charAt(0); //string starts at zero

            //track if the guess is correct
            boolean isGuessCorrect = false;

            //loop through each letter in the secret word and check if it's match the user input
            for (int i = 0; i < secretWord.length(); i++) {

                if(secretWord.charAt(i) == guess){
                    //reveal the correctly guessed letter on the game board
                    gameBoard[i] = guess;
                    isGuessCorrect = true;
                }
            }

            //update the game status based on the game
            if(isGuessCorrect){
                System.out.println("Good job! You found a match!");

                //check if there are still unrevealed letters
                hasMissingLetters = containsUnderscore(gameBoard, PLACEHOLDER);
            }
            else {
                System.out.println("Incorrect!");
                //decrement the attempts if the guess is wrong
                maxAttempts--;
                System.out.println("You have " + maxAttempts + " " + "attempts left.");
            }



        }
        //end of game based on whether the word was revealed
        if(hasMissingLetters){
            System.out.println("You've run out of attempts. The secret word is: " + secretWord);
        }
        else {
            System.out.println("Success!!! You've revealed the secret word: " + secretWord);
        }



        scanner.close();
    }

    private static boolean containsUnderscore(char[] gameBoard, char PLACEHOLDER) {
        //loop through gameboard and check if there are still underscores left
        for(char temp : gameBoard){
            if(temp == PLACEHOLDER){
                return true;
            }
        }
        return false;
    }

    private static String getRandomWord(String fileName) throws IOException {

//        String[] words = {"Banana", "Java", "Milk"};

        //read in all lines from the list
        List<String> lineList = Files.readAllLines(Path.of(fileName));

        //convert the list to array
        String[] words = lineList.toArray(new String[0]); //based on the words numbers in the list

        //Create a Random object
        Random random = new Random();
        // Generate a random integer (within a bound) between 3 arrays, 0 - 2
        int index = random.nextInt(words.length);

        //init 3 words in the array
        String theWord = words[index];

        //it will return the random words
        return theWord.toUpperCase();


    }


}
