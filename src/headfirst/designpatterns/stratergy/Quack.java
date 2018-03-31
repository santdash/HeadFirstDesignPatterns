package headfirst.designpatterns.stratergy;

/**
 * Created by dashsan on 3/13/2017.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack quack");
    }
}
