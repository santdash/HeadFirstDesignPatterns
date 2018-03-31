package headfirst.designpatterns.Iterator;

import java.util.Iterator;

/**
 * Created by dashsan on 5/13/2017.
 */
public class MenuItemsIterator implements Iterator<String> {

    private final String[] menuItems;
    private int position = 0;

    public MenuItemsIterator(String[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return !(position >= menuItems.length || menuItems[position] == null);
    }

    @Override
    public String next() {
        String item = menuItems[position];
        position++;
        return item;
    }
}
