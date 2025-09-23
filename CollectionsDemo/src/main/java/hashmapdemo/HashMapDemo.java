package hashmapdemo;

import java.util.HashMap;
import java.util.Map;


//can't contain duplicate value
//unordered
public class HashMapDemo {
    public static void main(String[] args) {

        Map<String, String> state = new HashMap<>();

        state.put("New York", "NY");
        state.put("Ohio", "OH");
        state.put("Washington", "WA");
        state.put("California", "CA");
        state.put("State", "ST");
        state.putIfAbsent("Ohee", "OO");

        int i = state.size();
        state.remove("Ohio");
        state.replace("State", "SS");

//        state.clear(); //remove all K,V from hashmap

//        System.out.println(state.get("Ohio"));
        System.out.println(state);

        System.out.println("Size: " + i);
    }
}
