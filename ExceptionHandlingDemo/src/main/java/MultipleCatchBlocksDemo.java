public class MultipleCatchBlocksDemo {
    public static void main(String[] args) {

        //String to int
        String numString = "I like beef.";

        parseString(null);

    }

    public static void parseString(String numString){

        //exception handling with try,catch block
        try{
            System.out.println(numString.length());
            //will fail cuz numString contains letters
            int numInt = Integer.parseInt(numString);
            System.out.println(numInt);

        }
        //can know exactly what exception this is
        //use OR for same output
        //if one of the two exceptions is caught,
        //multi catch
        catch (NumberFormatException | NullPointerException e) {
            System.out.println("Please enter a valid number.");
        }
        //will catch other exceptions beside the above exception
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block always runs.");
        }
    }
}
