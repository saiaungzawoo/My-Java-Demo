package arraylistdemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListMethodDemo {
    public static void main(String[] args) {

        //init ArrayList in one line
        List<Integer> num = new ArrayList<>(List.of(210, 34, 45, 23, 12));

        num.remove(1); //remove by index

//        num.removeAll(List.of(12,45)); //remove by collection

//        num.retainAll(List.of(210)); //remove all elements except 210

        num.sort(Comparator.naturalOrder()); //low to high

        num.sort(Comparator.reverseOrder()); //high to low

        num.clear(); //remove all elements

//        for(int output : num){
//            System.out.println(output);
//        }

        System.out.println(num.isEmpty());
    }
}
