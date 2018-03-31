package headfirst.designpatterns.FactoryPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dashsan on 3/18/2017.
 */
public class PizzaFactory {
    private Pizza pizza;
    protected List<String> pizzaList = new ArrayList<>();

    public PizzaFactory(){
        pizzaList.add("Cheese");
        pizzaList.add("Ham");
    }

    public Pizza createPizza(String type) {
        for (String piType: pizzaList){
            if (type.equals(piType)){
                if (piType.equals("Cheese")){
                    pizza = new CheesePizza(type);
                }
                else if (piType.equals("Ham")){
                    pizza = new HamPizza(type);
                }

            }
        }

        return pizza;
    }
}
