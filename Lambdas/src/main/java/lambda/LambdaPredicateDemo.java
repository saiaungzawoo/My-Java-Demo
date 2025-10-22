package lambda;

import java.util.function.Predicate;

public class LambdaPredicateDemo {
    public static void main(String[] args) {

        //Predicate - built-in java functional interface

        //return true or false
        Predicate<Integer> equal = i -> (i == 100);

        Predicate<Integer> less = i -> (i < 150);

        boolean result = equal.test(5);
        System.out.println(result);

        //and
        boolean result1 = equal.and(less).test(100);
        System.out.println(result1);

        //or
        boolean result2 = equal.or(less).test(2);
        System.out.println(result2);

        //negate (opposite)
        boolean result3 = less.negate().test(200);
        System.out.println(result3);
    }
}
