package sant.practice.collection.map;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> ihm = MapDemo1.getMap(new IdentityHashMap<>());
        System.out.println(ihm);

        /*
            IdentityHashMap uses == method for comparing keys whereas HashMap/LinkedHashMap uses equals method.
         */
        ihm.put(200, "SomeotherVal");
        System.out.println(ihm);

        /*
        Prove above point.
         */
        Map<Integer, String> ihmOne = MapDemo1.getMap(new IdentityHashMap<>());
        Integer newKey = new Integer(1111);
        ihmOne.put(newKey, "SpecialValue");
        System.out.println(ihmOne);
        ihmOne.put(newKey, "ChangedValue");
        System.out.println(ihmOne);

    }
}
