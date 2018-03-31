package headfirst.designpatterns.decoratorAlternative;

/**
 * Created by dashsan on 3/15/2017.
 */
public class Capuchinno implements ICoffee {
    @Override
    public float getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Cappuchinno";
    }
}
