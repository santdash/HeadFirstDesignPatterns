package headfirst.designpatterns.decoratorpattern;

/**
 * Created by dashsan on 3/14/2017.
 */
public class Expresso implements Beverage {

    @Override
    public float getCost() {
        return 12;
    }

    @Override
    public String getDescription() {
        return "Expresso";
    }
}
