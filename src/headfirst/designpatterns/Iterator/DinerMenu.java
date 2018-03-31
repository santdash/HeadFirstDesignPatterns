package headfirst.designpatterns.Iterator;

import java.util.Iterator;

/**
 * Created by dashsan on 5/13/2017.
 */
public class DinerMenu implements Menu {
    private String[] menuItems;
    private static final int MAX_ITEMS = 5;
    private int numberOfItems = 0;

    public DinerMenu() {
        menuItems = new String[MAX_ITEMS];
        addItem("Roti + Santula");
        addItem("Rice + Subji");
        addItem("Veg Biriyani");
        addItem("Chicken Biriyani");
        addItem("Kashmiri Pulao");
    }

    public void addItem(String item){
        if ( numberOfItems > MAX_ITEMS ){
            throw new ArrayIndexOutOfBoundsException("Number of Items exceeds the limit");
        }
        menuItems[numberOfItems] = item;
        numberOfItems++;
    }

    @Override
    public Iterator<String> createIterator() {
        return new MenuItemsIterator(menuItems);
    }
}
