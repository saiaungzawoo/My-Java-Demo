public class ExceptionHandlingDemo {
    public static void main(String[] args) {

        //String to int
        String numString = "I like beef.";

        //exception handling with try,catch block
        try{
            //will fail cuz numString contains letters
            int numInt = Integer.parseInt(numString);
            System.out.println(numInt);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
