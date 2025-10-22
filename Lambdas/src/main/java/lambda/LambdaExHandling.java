package lambda;

public class LambdaExHandling {
    public static void main(String[] args) {

        Num number = (x,y) -> {
            try{
                return x/y;
            }
            catch(ArithmeticException e){

                System.out.println("Can't be divided by zero.");
                return -1; //-1 means error
            }

        };

        int result = number.calc(20,0);
        System.out.println("Result: " + result);

    }
}

@FunctionalInterface
interface Num{

    int calc(int x, int y);
}
