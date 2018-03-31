package sant.practice.collection.map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
        lhm.putAll(MapDemo1.getMap(new LinkedHashMap<>()));
        System.out.println(lhm); // Order is preserved, All other methods are same as HashMap.
    }
}
