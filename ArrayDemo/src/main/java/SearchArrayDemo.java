import java.util.Scanner;
import java.util.Arrays;

public class SearchArrayDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //read user input
        int[] arr = userSizeInput(scanner);

        System.out.println();

        //sort the array
        Arrays.sort(arr);

        //prompt the user for search key number
        System.out.print("What number do you want to search for?: ");
        int searchKey = scanner.nextInt();
        scanner.nextLine();

        System.out.println();

        scanner.close();

        //print out the search result
        searchArray(arr, searchKey);


    }


    private static int[] userSizeInput(Scanner scanner){
        //read user input

        System.out.print("What size array do you want?: ");
        int sizeArray = scanner.nextInt();
        scanner.nextLine();

        //init array
        int[] arr = new int[sizeArray];

        //prompt the user for array content
        for (int i = 0; i <arr.length ; i++) {
            System.out.print("Enter number " + (i+1) + " :");
            arr[i]= scanner.nextInt();
            scanner.nextLine();
        }

        return arr;


    }

    private static void searchArray(int[] arr, int searchKey){
        //search array
        int result = Arrays.binarySearch(arr, searchKey);

        boolean found = (result >=0);

        if(found){
            System.out.println("You found the number: " + searchKey);
        }
        else {
            System.out.println("You didn't find anything.");
        }


    }

}
