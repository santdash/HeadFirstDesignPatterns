package headfirst.designpatterns.stratergy;

/**
 * Created by dashsan on 3/13/2017.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        super(new Quack(), new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("I am model duck");
    }
}
