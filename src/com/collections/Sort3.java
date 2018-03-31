package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by dashsan on 3/21/2017.
 */
public class Sort3 {
    public static void main(String[] args) {
        Time2 t1 = new Time2(02, 35, 34);
        Time2 t2 = new Time2(15,22,6);
        Time2 t3 = new Time2(2,10,22);
        Time2 t4 = new Time2(14,11,00);

        List<Time2> list = new ArrayList<>();
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);

        System.out.printf("Unsorted time: %s%n", list);

        Collections.sort(list);

        System.out.printf("Sort time: %s%n", list);
    }
}
