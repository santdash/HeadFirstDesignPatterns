package com.collections;

import java.util.*;

/**
 * Created by dashsan on 3/21/2017.
 */
public class Sort1 {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        List<String> list = Arrays.asList(suits);
        System.out.printf("Unsorted array elements: %s%n", list);

        Collections.sort(list); // Sort array list
        System.out.printf("Sorted array elements: %s%n", list);
    }
}
