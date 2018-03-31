package headfirst.designpatterns.decoratorpattern;

/**
 * Created by dashsan on 3/14/2017.
 */
public abstract class BeverageAddon implements Beverage {

    protected Beverage beverage;

    public BeverageAddon(Beverage beverage){
        this.beverage = beverage;
    }

}
