package sant.practice.collection.basic;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> li = new LinkedList<>(CursorsDemo.getCollection());
        //Only additional methods
        li.addFirst("1");
        li.addLast("2");
        li.add("3");
        System.out.println(li);
        System.out.println(li.getFirst());
        System.out.println(li.getLast());
        String rmElement = li.removeFirst();
        System.out.println("Removed element " + rmElement + " Remaining list: " + li);
        rmElement = li.removeLast();
        System.out.println(li + " " + rmElement);

        li.offer("Offered");
        System.out.println(li);

    }
}
