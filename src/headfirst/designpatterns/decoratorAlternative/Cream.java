package headfirst.designpatterns.decoratorAlternative;

/**
 * Created by dashsan on 3/15/2017.
 */
public class Cream implements ICoffeeAddon {
    @Override
    public float getCost() {
        return 2;
    }

    @Override
    public String getDescription() {
        return "Cream";
    }
}
