package lambda;

public class CreateLambdaDemo {

    public static void main(String[] args) {

        Greetings lambda = (o) -> System.out.println(o);
        lambda.greet("Hello!");
    }
}

//functional interface
@FunctionalInterface
 interface Greetings{

    //abstract method
     void greet(String g);
}
