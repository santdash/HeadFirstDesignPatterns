package headfirst.designpatterns.stratergy;

/**
 * Created by dashsan on 3/13/2017.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak squeak");
    }
}
