package arraylistdemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<String> toDoList = new ArrayList<>();
        toDoList.add("Have Breakfast");
        toDoList.add("Have Lunch");
        toDoList.add("Have Dinner");
        toDoList.add(2, "Sleep");
        toDoList.set(2, "Wake up"); //change the value

        System.out.println(toDoList);





    }
}
