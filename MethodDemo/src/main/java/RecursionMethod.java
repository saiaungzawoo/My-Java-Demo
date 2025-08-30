public class RecursionMethod {

    public static void main(String[] args) {

        int value = 5;
        int result = factorial(value);

        System.out.println(result);

    }

    static int factorial (int num){

        //base case//
        if (num == 0){
            return 1;
        }
        else {
            //recursive case//
            return num * factorial(num - 1);
        }

    }
}
