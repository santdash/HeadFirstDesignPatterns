package sant.practice.collection.set;

import java.util.LinkedHashSet;

public class LinkedSetDemo {
    private String hi;
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(5, 0.35f);
        linkedHashSet.add("S1");
        linkedHashSet.add("S2");
        linkedHashSet.add("S3");
        linkedHashSet.add("S4");
        linkedHashSet.add("S5");
        linkedHashSet.add("S6");
        System.out.println(linkedHashSet); // Order is preserved. Everything else is same as HashSet.
    }

}
