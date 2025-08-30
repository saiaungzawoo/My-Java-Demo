import java.util.Scanner;

public class ArraysDemo2D {

    public static void main(String[] args) {

        //write with method tomorrow

        //prompt the user for rows and cols
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter rows: ");
        int rowNum = scanner.nextInt();

        System.out.print("Please enter columns: ");
        int colNum = scanner.nextInt();

        scanner.close();

        //init 2D arrays
        int [][] table = new int[rowNum][colNum];

        //compute multiplication table
        for(int row = 0; row < rowNum; row++){

            for(int col = 0; col < colNum; col++){

                table [row][col] = (row+1) * (col+1);
                
               
            }
        }
        System.out.println();

        //print out the result
        for (int row = 0; row < rowNum; row++) {

            for(int col = 0; col < colNum; col++){

                System.out.print(table[row][col] + "\t");
            }
            System.out.println();
            
        }



    }
}
