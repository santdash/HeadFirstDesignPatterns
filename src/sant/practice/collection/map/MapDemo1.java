package sant.practice.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<Integer, String> map = getMap(new HashMap<>());
        addDuplicateKey(map);
        map = getMap(new HashMap<>());

        map.forEach(MapDemo1::printKeyVal);

        // PutAll
        Map<Integer, String>  map1 = new HashMap<>();
        map1.put(2020, "SomeExistingVal");
        map1.putAll(map); // Merge of Map.
        System.out.println(map1);

        System.out.println("Does map1 contains key 100:" + map1.containsKey(100));
        System.out.println("Does map1 contains value S2:"+ map.containsValue("S2"));
        System.out.println("Size of map1: " + map1.size());

        System.out.println("Removed : " + map1.remove(500) + "\nResulting map: " + map1);
        map1.clear();

        System.out.println("Map Values: " + map.values());
        System.out.println("Map keys(keySet): " + map.keySet());

        System.out.println("=================EntrySet Demo=================");
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry: entries){
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
            if ( entry.getKey().equals(400)){
                entry.setValue("NEWVAL");
                System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
            }
        }

    }

    private static void printKeyVal(Integer a, String b){
        System.out.println("key: "+ a +" val: " + b);
    }

    public static Map<Integer, String> getMap(Map<Integer, String> map){
        map.put(100, "S1");
        map.put(200, "S2");
        map.put(300, "S3");
        map.put(400, "S4");
        map.put(500, "S5");
        map.put(600, "S6");

        return map;
    }

    public static void addDuplicateKey(Map<Integer, String> map){
        System.out.println("Before key 100 has val: " + map.get(100));
        String s = map.put(100, "S7");
        System.out.println("After key 100 has val: " + map.get(100));
        System.out.println("Duplicate key put returned: " + s);
    }
}
