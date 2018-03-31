package san.doubt.collection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class SetAdd {
    private final Map<Integer, Set<Integer>> integerSetMap
            = new ConcurrentHashMap<>();

    private final List<Integer> integers = new ArrayList<>(2);

    private void add(int a, int b){
        if ( integerSetMap.containsKey(a)){
            integerSetMap.get(a).add(b);
        }
        else
        {
            HashSet<Integer> s = new HashSet<>();
            s.add(b);
            integerSetMap.put(a, s);
        }
    }

    private void addToInt(Integer i){
        integers.add(i);
    }

    public static void main(String[] args) {
        SetAdd sa = new SetAdd();
        sa.add(20, 30);
        sa.add(20, 40);

        for (Integer i: sa.integerSetMap.get(20)){
            System.out.println(i);
        }
        sa.integerSetMap.get(20).remove(30);
        sa.integerSetMap.get(20).remove(50);

        for (Integer i: sa.integerSetMap.get(20)){
            System.out.println(i);
        }

        long max = Math.max(1000L, 900000L);
        System.out.println("Max: " + max);
        System.out.println(Integer.valueOf(86400000).toString());
        for (int i=0; i<=20000; i++){
            sa.addToInt(i);
            System.out.println("Added :" + i);
        }

    }


}
