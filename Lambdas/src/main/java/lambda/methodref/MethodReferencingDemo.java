package lambda.methodref;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferencingDemo {
    public static void main(String[] args) {

        //check how many vowels are in a string

        //static method reference
        Function<String, Integer> vowelsCount = Vowel::countVowels;
        System.out.println("Vowels Count: ");
        System.out.println(vowelsCount.apply("book"));


        //instance method reference
        String name = "Sai";

        Predicate<String> value = name::startsWith;
        System.out.println(value.test("S"));
    }
}
