package headfirst.designpatterns.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by dashsan on 5/13/2017.
 */
public class CoffeeHouseMenu implements Menu {
    private ArrayList<String> menuItems = new ArrayList<String>();

    public CoffeeHouseMenu() {
        menuItems.add("Cappucinno");
        menuItems.add("Iced Coffee");
        menuItems.add("Grean Tea");
        menuItems.add("Normal Tea");
    }

    @Override
    public Iterator<String> createIterator() {
        return menuItems.iterator();
    }
}
