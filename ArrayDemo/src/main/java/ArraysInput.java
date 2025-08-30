import java.util.Scanner;

public class ArraysInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        //ask the user for numbers of input//
        System.out.print("How many grades do you want to enter? ");
        int numGrades = scanner.nextInt();
        System.out.println();

        //init//
        double[] input =  new double[numGrades];

        //read grades//
        for (int i = 0; i <input.length ; i++) {
            System.out.print("Please enter grade " + (i+1) + " :");
            input[i] = scanner.nextDouble();
        }

        //output//
        for(double result : input){
            System.out.println(result);
        }



        scanner.close();
    }





}
