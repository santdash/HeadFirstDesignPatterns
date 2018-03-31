package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by dashsan on 3/21/2017.
 */
public class Sort4 {
    public static void main(String[] args) {
        Time3 t1 = new Time3(02, 35, 34);
        Time3 t2 = new Time3(15, 22, 6);
        Time3 t3 = new Time3(2, 10, 22);
        Time3 t4 = new Time3(14, 11, 00);

        List<Time3> list = new ArrayList<>();
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);

        //List<Time3> copyList = new ArrayList<>();

        //Collections.copy(copyList, list);

        System.out.printf("Unsorted time: %s%n", list);

        /* we can use list.sort also and pass the comparator alone */
        Collections.sort(list,(o1, o2) -> {
            if (o1.getHour() - o2.getHour() != 0)
                return o1.getHour() - o2.getHour();
            else if (o1.getMinute() - o2.getMinute() != 0)
                return o1.getMinute() - o2.getMinute();
            else
                return o1.getSeconds() - o2.getSeconds();

        });

        System.out.printf("Sorted time: %s%n", list);
        //System.out.printf("Unsorted time: %s%n", copyList);
    }
}
