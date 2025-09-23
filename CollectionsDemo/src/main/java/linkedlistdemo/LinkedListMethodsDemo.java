package linkedlistdemo;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMethodsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> todoItems = new LinkedList<>(List.of(250, 350, 450,340,240));


        System.out.println(todoItems.contains(250));

        System.out.println(todoItems.indexOf(450)); //return index position


        //methods

        todoItems.pop(); //remove first index

        todoItems.removeFirst();
        todoItems.removeLast();

        todoItems.retainAll(List.of(340,240)); //delete all num except these num

        todoItems.sort(Comparator.naturalOrder());
        todoItems.sort(Comparator.reverseOrder());
        todoItems.clear();
        todoItems.isEmpty();

        todoItems.peekFirst();
        todoItems.peekLast();

        for(int i : todoItems){
            System.out.println(i);
        }

    }
}
