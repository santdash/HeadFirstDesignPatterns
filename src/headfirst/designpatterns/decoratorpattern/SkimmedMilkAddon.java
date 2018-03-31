package headfirst.designpatterns.decoratorpattern;

/**
 * Created by dashsan on 3/14/2017.
 */
public class SkimmedMilkAddon extends BeverageAddon {

    public SkimmedMilkAddon(Beverage beverage) {
        super(beverage);
        System.out.println("Beverage Class is: " + beverage.getClass());
    }

    @Override
    public float getCost() {
        return this.beverage.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " , SkimmedMilk";
    }
}
