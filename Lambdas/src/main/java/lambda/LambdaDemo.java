package lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Eric");
        names.add("Sai");
        names.add("Alina");

//         for(String name : names){
//             System.out.println(name);
//         }

//        for (int i = 0; i < names.size(); i++) {
//            System.out.println(names.get(i));
//        }

        //list has functional interface
        names.forEach((name) -> System.out.println(name));
    }
}
