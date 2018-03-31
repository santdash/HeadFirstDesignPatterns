package headfirst.designpatterns.stratergy;

/**
 * Created by dashsan on 3/13/2017.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying...");
    }
}
