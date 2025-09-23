package linkedlistdemo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

        //Linkedlist implements list and deque interface..
        LinkedList<Integer> todoItems = new LinkedList<>(List.of(250, 350, 450));

//        todoItems.add(10);
//        todoItems.add(100);
//        todoItems.add(150);

        System.out.println(todoItems.get(2)); //return the value from that index

        todoItems.set(2,550); //change the value from that index

        //same result, different methods cuz it implements list, deque,etc..
        todoItems.addFirst(1);
        todoItems.addLast(5);
        todoItems.offer(1);

        for(int i : todoItems){
            System.out.println(i);

        }
    }
}
