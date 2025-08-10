public class NestedForLoop {

    public static void main(String[] args) {

        //3x3 multiplication table//

        for (int row = 1; row <= 3 ; row++) {

            for (int col = 1; col <=3 ; col++) {
                int table = row * col;
                System.out.print(table + "\t");
            }
            System.out.println();


        }
    }
}
