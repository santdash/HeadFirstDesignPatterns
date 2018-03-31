package headfirst.designpatterns.decoratorAlternative;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dashsan on 3/15/2017.
 */
public class CoffeeMaker {

    private ICoffee coffee;
    private List<ICoffeeAddon> addons = new ArrayList<>();

    public CoffeeMaker(ICoffee plainCoffee) {
        this.coffee = plainCoffee;
    }

    public CoffeeMaker addAddOn(ICoffeeAddon addon){
        addons.add(addon);
        return this;
    }

    public float getCost(){
        float totalCost = 0;
        // Add addOns cost first.
        for (ICoffeeAddon addon: addons){
            totalCost += addon.getCost();
        }
        // Add the base coffee cost.
        return this.coffee.getCost() + totalCost;
    }

    public String getDescription(){
        String description = this.coffee.getDescription();
        for (ICoffeeAddon addon: addons){
            description += " ," +addon.getDescription();
        }
        return description;
    }
}
