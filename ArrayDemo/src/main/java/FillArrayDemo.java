import java.util.Scanner;
import java.util.Arrays;

public class FillArrayDemo {

    public static void main(String[] args) {

        int[] array = readInput();

        System.out.println();

        printOutput(array);
    }

    private static int[] readInput() {
        //read user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("What size array do you want?: ");
        int sizeArray = scanner.nextInt();
        scanner.nextLine();

        //enter number
        System.out.print("What number?: ");
        int numArray = scanner.nextInt();
        scanner.nextLine();

        //init array based on the size
        int[] array = new int[sizeArray];

        //fill the array with given number
        Arrays.fill(array, numArray);



        scanner.close();
        return array;
    }

    private static void printOutput(int[] array) {
        //print out the array element
        for(int result : array){
            System.out.println("Your arrays are " + result);
        }
    }
}
