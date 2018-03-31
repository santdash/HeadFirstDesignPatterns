package com.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by dashsan on 3/21/2017.
 */
public class UsingToArray {
    public static void main(String[] args) {
        String[] colors = {"black", "blue", "yellow"};
        LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));
        links.addLast("red");
        links.add("pink");
        links.add(3,"green");
        links.addFirst("cyan");

        // Convert linked list to an array
        colors = links.toArray(new String[links.size()]);

        for (String color: colors)
            System.out.println(color);

        iter(links);

        for (String val: links){
            System.out.println("Iterate");
            System.out.println(val);
        }
    }

    public static void iter(List<String> c ){
        Iterator<String> itr = c.iterator();
        System.out.println("---Printing in iterator");
        while ( itr.hasNext()){
            System.out.println(itr.next());

        }
    }
}
