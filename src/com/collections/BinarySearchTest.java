package com.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by dashsan on 3/23/2017.
 */
/*
Binary search only works on sorted elements.
 */
public class BinarySearchTest {
    public static void main(String[] args) {
        String[] colors = {"red", "blue", "purple", "tan", "black", "yellow", "pink", "white"};
        List<String> list = Arrays.asList(colors);

        Collections.sort(list);
        System.out.printf("Sorted array list: %s%n", list);

        printSearchResult(list, "red");
        printSearchResult(list, "gray");
        printSearchResult(list, "aqua");
    }

    private static void printSearchResult(List<String> lst, String search){
        int result = 0;

        result = Collections.binarySearch(lst, search); // Doing binary search.
        if ( result >= 0 ){
            System.out.printf("Found %s at index %s%n", search, result);
        }
        else
        {
            System.out.printf("Could not find key : %s(%d)%n", search, result);
        }
    }
}
