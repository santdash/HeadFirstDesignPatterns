package headfirst.designpatterns.stratergy;

/**
 * Created by dashsan on 3/13/2017.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Can't Fly...");
    }
}
