package arraylistobjdemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListObjDemo {
    public static void main(String[] args) {

        List<TodoItems> todoItems = new ArrayList<>();

        todoItems.add(new TodoItems("Sleeping", 10));
        todoItems.add(new TodoItems("Eating", 8));
        todoItems.add(new TodoItems("Studying", 7));

        for(TodoItems items : todoItems){
            System.out.println(items.getTask() + " has a priority of " + items.getPriority());
        }

        //ask why new use and why item uses
    }
}
