package sant.practice.collection.basic;

import java.util.ArrayList;
import java.util.List;

public class ListIface {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.remove(2);
        System.out.println(l1);
        l1.add(4);
        l1.add(5);
        l1.add(2);
        l1.add(2, 10);
        System.out.println(l1);

        System.out.println(l1.size());
        l1.remove(0);
        System.out.println(l1.size() + " " + l1 + " " + l1.get(0));

        //
        System.out.println(l1);
        System.out.println("Index of 2 " + l1.indexOf(2));
        System.out.println("Last Index of 2 " + l1.lastIndexOf(2));
        l1.forEach(integer -> System.out.println(integer));
    }
}
