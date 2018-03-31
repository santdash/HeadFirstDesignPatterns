package headfirst.designpatterns.FactoryPattern;

/**
 * Created by dashsan on 3/18/2017.
 */
public class PizzaMaker {

    public static void main(String[] args) {
        /* this way client has to instantiate each type of pizza */
        //Pizza cheesePizza = new CheesePizza();
        //Pizza hamPizza = new HamPizza();
        try {
            System.out.println("Welcome to pizza maker");
            PizzaStore pizzaStore = new PizzaStore(new PizzaFactory());
            pizzaStore.orderPizza("Cheese");
        }
        catch (Exception e){
            e.getMessage();
        }

    }
}
