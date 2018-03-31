package sant;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by dashsan on 4/6/17.
 */
public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
        treeSet.add(10);
        treeSet.add(20);
        System.out.println(treeSet);
    }

}
