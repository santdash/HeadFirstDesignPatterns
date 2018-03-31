package sant.practice.collection.basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIface {
    public static void main(String[] args) {
        Collection<Integer> cl = new ArrayList<>();
        cl.add(10);
        cl.add(20);

        Collection<Integer> c2 = new ArrayList<>();
        c2.add(30);
        c2.add(40);

        // Add all
        cl.addAll(c2);
        System.out.println(cl);

        // isEmpty
        System.out.println(cl.isEmpty());
        // size
        System.out.println(cl.size());
        // contains
        System.out.println(cl.contains(30));
        // remove
        cl.remove(30);
        System.out.println(cl);
        // removeAll
        cl.removeAll(c2);
        System.out.println(cl);
        //containsAll
        System.out.println(cl.containsAll(cl));

        // iterator
        Iterator<Integer> iterator = cl.iterator();
        while ( iterator.hasNext()){
            System.out.println(iterator.next());
        }

        cl.removeIf(a -> a < 20);
        System.out.println(cl);

        cl.clear();


    }
}
