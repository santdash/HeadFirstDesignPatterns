package sant.practice.collection.basic;

import java.util.*;

public class CursorsDemo {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>(getCollection());

        // Iterator
        System.out.println("Collection: " + list);
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){
            String s = iter.next();
            System.out.println("ITERATOR: " + s);
            if ( s.contains("10") ){
                iter.remove();
            }
        }
        System.out.println("New Collection: " + list);

        list.clear();
        list = (LinkedList<String>) getCollection();

        System.out.println("Collection: " + list);
        ListIterator<String> listIterator = list.listIterator();
        int i = 0;
        while(listIterator.hasNext()) {
            i++;
            System.out.println("Item number: " + i);
            System.out.println("Element: " + listIterator.next());
            if ( listIterator.hasPrevious() ){
                // Next has been executed, so expect Element and previous element same value.
                if ( i == 1 ) {
                    // Move backward
                    System.out.println("Previous Element " + listIterator.previous());
                    listIterator.add("S13");
                }
                else
                {
                    System.out.println("Previous Element " + list.get(listIterator.previousIndex()));
                }
            }
            if ( i == 10 ){
                // Replace value
                listIterator.set("SPECIALValue");
            }
            if ( i == 13 ){
                // Remove element
                listIterator.remove();
            }

        }

        System.out.println(list);

        // Vector and Enumeration
        Vector<String> vector = new Vector<>(getCollection());
        Enumeration<String> enumeration = vector.elements();
        while(enumeration.hasMoreElements()){
            System.out.println("Vector Element: " + enumeration.nextElement());
        }



    }

    public static Collection<String> getCollection(){
        List<String> list = new LinkedList<>();
        list.add("S1");
        list.add("S2");
        list.add("S3");
        list.add("S4");
        list.add("S5");
        list.add("S6");
        list.add("S7");
        list.add("S8");
        list.add("S9");
        list.add("S10");
        list.add("S11");
        list.add("S12");
        return list;
    }
}
