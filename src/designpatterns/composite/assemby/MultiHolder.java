package designpatterns.composite.assemby;

import java.util.ArrayList;
import java.util.List;

public abstract class MultiHolder implements AssembleItem{

    private List<AssembleItem> items = new ArrayList<>();

    public void add(AssembleItem i){
        items.add(i);
    }

    @Override
    public int getPrice() {
        int price = 0;
        System.out.println(getName());
        for (AssembleItem item: items){
            price += item.getPrice();
        }
        say();
        return price;
    }

    public void say(){
        System.out.println("Saying MultiHolder");
    }
}
