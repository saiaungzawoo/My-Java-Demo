package lambda.methodref;

public class Vowel {

    //static method
    //count vowels in a string
    public static int countVowels(String s){

        //string to char to count
        int count = 0;
        String vowels = "AEIOUaeiou";

        //loop the string
        //convert string to char
        for(char c : s.toCharArray()){

            //if there's still vowels to count,which is string to char
            if(vowels.indexOf(c) != -1){
                count++;
            }
        }
        return count;
    }
}
