package com.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by dashsan on 3/23/2017.
 */
public class Algorithm1 {
    public static void main(String[] args) {
        Character[] letters = {'P', 'C', 'M'};

        List<Character> list = Arrays.asList(letters);
        output(list);

        Collections.reverse(list);
        System.out.println("\nList after reverse");
        output(list);

        // Copy list..
        // The following does not work.
        //List<Character> copyList = new ArrayList<>(3);
        System.out.println("\nAfter copy");
        Character[] copy = new Character[3];
        List<Character> copyList = Arrays.asList(copy);
        Collections.copy(copyList, list);

        output(copyList);

        // Fill
        Collections.fill(list, 'R');
        output(list);
    }

    private static void output(List<Character> list){
        System.out.print("The list is: ");

        for (Character element: list)
            System.out.printf("%s ", element);

        System.out.printf("%nMax: %s", Collections.max(list));
        System.out.printf(" Min: %s", Collections.min(list));

    }
}
