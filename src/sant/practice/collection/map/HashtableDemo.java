package sant.practice.collection.map;

import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(22, "VAL1");
        ht.put(11, "VAL2");

        System.out.println(ht);
    }
    /*
    Default size of Hashtable is 11. That means 11 buckets are available. Depending on the hashcode of the object
    they are placed in the bucket. Again, if multiple objects are in same buckets, they are evaluated from left to right
     */
}
