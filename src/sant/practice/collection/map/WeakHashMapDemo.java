package sant.practice.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

    public static void main(String[] args) {
        /*
            When object has no reference but the object is part of any other hashmap other than WeakHashMap,
            garbage collector cannot collect it.

            ** Note: Garbage collector calls finalize method before collecting the object.
         */
        Map<Temp, String> hashMap = new HashMap<>();
        Temp t = new Temp(10);
        hashMap.put(t, "SVal");
        System.out.println(hashMap);
        t = null; // Now, no Object reference has reference to this object.
        System.gc(); // Run garbage collector.
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(hashMap); // Since this is HashMap garbage collector could not collect this object.

        System.out.println("==================WeakHashMap====================");
        Map<Temp, String> weakHashMap = new WeakHashMap<>();
        Temp tw1 = new Temp(20);
        weakHashMap.put(tw1, "Temp1");
        weakHashMap.put(new Temp(30), "Temp2");
        Temp tw2 = new Temp(40);
        weakHashMap.put(tw2, "ShouldExist");
        System.out.println(weakHashMap);
        tw1 = null;
        System.gc();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(weakHashMap); // Garbage collector able to collect the objects not having any reference.

        System.out.println("======================Check for values===============");
        Integer i = new Integer(10);
        Map<Integer, Temp> whm = new WeakHashMap<>();
        whm.put(i, new Temp(20));
        whm.put(20, new Temp(30));

        System.out.println(whm);
        i = null;
        System.gc();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(whm);

    }

    private static class Temp {
        private Integer num;

        public Temp(Integer num){
            this.num = num;
        }

        public Integer getNum() {
            return num;
        }

        @Override
        public String toString() {
            return "Temp" + num;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Garbage collector calling finalize " + num);
        }
    }
}
