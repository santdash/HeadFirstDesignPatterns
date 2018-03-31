package sant.practice.collection.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        treeSetNoArgs();
        treeSetNotComparable();
        treeSetNotComparableWithComparator();
    }

    private static void treeSetNotComparableWithComparator() {
        TreeSet<StringBuffer>  treeSet = new TreeSet<>(Comparator.comparing(StringBuffer::toString));
        System.out.println("treeSetNotComparableWithComparator: Adding StringBuffer Objects, treeset initialized with Comparator");
        treeSet.add(new StringBuffer("Hi00"));
        treeSet.add(new StringBuffer("Hello"));
        System.out.println("treeSetNotComparableWithComparator: No exception. treeset:" + treeSet);
    }

    private static void treeSetNotComparable() {
        TreeSet<StringBuffer> treeSet = new TreeSet<>();
        try {
            treeSet.add(new StringBuffer("A"));
        } catch (ClassCastException cce){
            System.out.println("treeSetNotComparable: StringBuffer are not comparable, hence exception");
        }
    }

    private static void treeSetNoArgs(){
        TreeSet treeSet = new TreeSet();
        try {
            treeSet.add(null);
        } catch ( NullPointerException npe ){
            System.out.println("treeSetNoArgs: Cannot add null to treeSet");
        }
        treeSet.add("A");
        treeSet.add("b");
        treeSet.add("c");
        treeSet.add("D");
        try {
            treeSet.add(10);
        } catch (ClassCastException cce){
            System.out.println("treeSetNoArgs: Heterogeneous elements not allowed");
        }
        System.out.println("treeSetNoArgs: " + treeSet);
    }
}
