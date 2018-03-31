package headfirst.designpatterns.FactoryPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dashsan on 3/18/2017.
 */
public class PizzaFactory {
    private Map<String, PizzaMaker> pizzaMap = new HashMap<>();

    private interface PizzaMaker {
        Pizza create(String type);
    }

    public PizzaFactory(){
        pizzaMap.put("Cheese", CheesePizza::new);
        pizzaMap.put("Ham", HamPizza::new);
    }

    public Pizza createPizza(String type) throws Exception {
        if ( pizzaMap.containsKey(type) )
            return pizzaMap.get(type).create(type);

        throw new Exception("Pizza type is not available");
    }
}
