package headfirst.designpatterns.Iterator;

import java.util.Iterator;

/**
 * Created by dashsan on 5/13/2017.
 */
public class Cafe {
    public static void main(String[] args) {
        DinerMenu dm = new DinerMenu();
        CoffeeHouseMenu chm = new CoffeeHouseMenu();

        // Get the iterators.
        Iterator<String> dmIterator = dm.createIterator();
        Iterator<String> chmIterator = chm.createIterator();

        System.out.println("#######Diner Menu#########");
        printMenu(dmIterator);

        System.out.println("#########Coffee House Menu#########");
        printMenu(chmIterator);
    }

    private static void printMenu(Iterator<String> iterator){
        while ( iterator.hasNext() ){
            System.out.println(iterator.next());
        }
        System.out.println();
    }
}
