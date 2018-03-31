package headfirst.designpatterns.FactoryPattern;

/**
 * Created by dashsan on 3/18/2017.
 */
public abstract class Pizza {

    private String pizzaName;

    public Pizza(String type) {
        this.pizzaName = type;
    }

    void prepare() {
        System.out.println("Preparing pizza " + pizzaName);
    }

    void bake() {
        System.out.println("Baking pizza");
    }

    void cut() {
        System.out.println("Cutting pizza");
    }

    void box() {
        System.out.println("Here is your " + pizzaName + " pizza");
    }
}
