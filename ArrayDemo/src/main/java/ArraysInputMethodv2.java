import java.util.Scanner;

public class ArraysInputMethodv2 {

    //main method
    public static void main(String[] args) {

        //user input
        double[] input = userArraysInput();

        //output
        arraysOutput(input);

        //compute average
        double gradeAverage = computeGradeAverage(input);
        System.out.printf("Average grades: %.2f" , gradeAverage); //print only 2 decimal place

        }

    private static void arraysOutput(double[] input) {
        for(double result : input){
            System.out.println(result);
        }
    }

    //method for displaying arrays
    private static double[] userArraysInput() {
        Scanner scanner = new Scanner(System.in);

        //ask the user for numbers of input//
        System.out.print("How many grades do you want to enter? ");
        int numGrades = scanner.nextInt();
        System.out.println();

        //init//
        double[] UserInput =  new double[numGrades];

        //read grades//
        for (int i = 0; i <UserInput.length ; i++) {
            System.out.print("Please enter grade " + (i+1) + " :");
            UserInput[i] = scanner.nextDouble();
        }
        scanner.close();

        return UserInput;

    }

    //method sum of the grades
    private static double computeGradeAverage(double[] UserInput) {
        double sum = 0.0;

        for(double result : UserInput){
            sum = sum + result;
            System.out.println();
        }

        //compute average based on length of arrays
        return sum / UserInput.length;

    }


}






