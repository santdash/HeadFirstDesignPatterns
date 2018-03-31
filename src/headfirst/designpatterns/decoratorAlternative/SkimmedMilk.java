package headfirst.designpatterns.decoratorAlternative;

/**
 * Created by dashsan on 3/15/2017.
 */
public class SkimmedMilk implements ICoffeeAddon {
    @Override
    public float getCost() {
        return 5;
    }

    @Override
    public String getDescription() {
        return "Skimmed Milk";
    }
}
