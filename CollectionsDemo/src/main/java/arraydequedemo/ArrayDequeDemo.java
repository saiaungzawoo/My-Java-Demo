package arraydequedemo;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String[] args) {

        Deque<String> cards = new ArrayDeque<>();
        cards.add("King");
        cards.add("Queen");

        cards.addFirst("Jack"); //add at the top
        cards.addLast("Spade"); //add at the bottom

        System.out.println(cards.getFirst());
        System.out.println(cards.getLast());

        cards.removeFirst();
        cards.removeLast();


        System.out.println(cards);
        System.out.println(cards.peekFirst());
        System.out.println(cards.peekFirst());
    }

}
