package headfirst.designpatterns.stratergy;

/**
 * Created by dashsan on 3/12/2017.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        super(new Quack(), new FlyWithWings());
    }


    @Override
    public void display() {
        System.out.println("Looks like Mallard Duck");
    }
}
