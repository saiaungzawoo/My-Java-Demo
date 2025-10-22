package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {

        //filter the names length

        List<String> names = Arrays.asList("Sai", "John", "Jenny", "Anna", "Jonathan");

        List<String> result = names.stream()//create stream
                .filter(s -> s.length() <= 6)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList()); //convert streams to list

        result.forEach(System.out::println);
    }
}
