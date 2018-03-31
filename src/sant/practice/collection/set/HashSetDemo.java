package sant.practice.collection.set;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> stringHasSet = new HashSet<>();
        stringHasSet.add("S1");
        stringHasSet.add("S2");
        stringHasSet.add("S3");
        stringHasSet.add("S4");
        stringHasSet.add("S5");
        /* Order is not preserved, no guaranty of the output order */
        System.out.println(stringHasSet);
        stringHasSet.add(null);
        System.out.println(stringHasSet);
        /* Inserting duplicate, no error but return type is false */
        final boolean p = stringHasSet.add("P");
        System.out.println("Duplicate element add returned: " + p);
        stringHasSet.clear();

        HashSet<String> stringHashSet = new HashSet<>(20); // With initialcapacity
        HashSet<String> stringHashSet1 = new HashSet<>(20, 0.80f); // 80 % load factor.
    }
}
