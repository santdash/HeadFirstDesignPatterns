package headfirst.designpatterns.decoratorpattern;

/**
 * Created by dashsan on 3/14/2017.
 */
public class Latte implements Beverage {
    @Override
    public float getCost() {
        return 9;
    }

    @Override
    public String getDescription() {
        return "Latte";
    }
}
