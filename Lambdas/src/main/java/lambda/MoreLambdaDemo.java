package lambda;

public class MoreLambdaDemo {
    public static void main(String[] args) {

        StringEndings string = (s) -> (s) + "!";
        System.out.println(string.perform("Hello"));
    }
}

@FunctionalInterface
interface StringEndings{

    String perform(String s);
}

