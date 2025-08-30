import java.util.Scanner;
import java.util.Arrays;

public class SortArrayDemo {

    public static void main(String[] args) {

        int[] arr = userInput();

        //before sorting array
        System.out.println("Before sorting: ");
        printArray(arr);

        System.out.println();

        //sort the array
        Arrays.sort(arr);

        System.out.println("After sorting: ");
        //after sorting array
        printArray(arr);


    }

    private static int[] userInput(){
        //read user input
        Scanner scanner = new Scanner(System.in);
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

        scanner.close();
        return arr;
    }

    //print out the array
    private static void printArray(int[] arr){
        for(int result : arr){
            System.out.println(result);
        }
    }




}
