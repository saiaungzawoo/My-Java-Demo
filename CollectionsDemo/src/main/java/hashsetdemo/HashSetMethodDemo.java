package hashsetdemo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetMethodDemo {
    public static void main(String[] args) {

        //no duplicate
        //unordered
        Set<String> books = new HashSet<>(List.of("Fiction", "Non-fiction", "Documentary"));
//        books.remove("Fiction");

        books.add("Non-fiction");
        books.add("Non-fiction");

        System.out.println(books.size());


        for(String book : books){
            System.out.println(book);
        }

    }
}
