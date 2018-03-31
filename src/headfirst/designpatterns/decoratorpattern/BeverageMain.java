package headfirst.designpatterns.decoratorpattern;

/**
 * Created by dashsan on 3/14/2017.
 */
public class BeverageMain {

    public static void main(String[] args) {
        Beverage myLatte = new Latte();
        myLatte = new SkimmedMilkAddon(new SoyMilkAddon(myLatte));
        System.out.println(myLatte.getDescription() + ": Rs." + myLatte.getCost());
    }
}
