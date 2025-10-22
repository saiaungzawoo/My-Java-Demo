package lambda;

public class LambaDetailsDemo {

    public static void main(String[] args) {

        String a = "Sai";
        String b = "Alex";

        //create Lambda logic
        StringCompare lambda = (e1, e2) -> {
            if(e1.length() > e2.length()){
                return e1;
            }
            return e2;
        };
        String word = lambda.compare(a,b);
        System.out.println(word);

    }
}

@FunctionalInterface
interface StringCompare{

    String compare(String s1, String s2);
}
