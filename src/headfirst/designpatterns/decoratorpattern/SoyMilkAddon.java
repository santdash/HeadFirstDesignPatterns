package headfirst.designpatterns.decoratorpattern;

/**
 * Created by dashsan on 3/14/2017.
 */
public class SoyMilkAddon extends BeverageAddon {


    public SoyMilkAddon(Beverage beverage) {
        super(beverage);
    }

    @Override
    public float getCost() {
        return this.beverage.getCost() + 3;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " , SoyMilkAddon";
    }

}
