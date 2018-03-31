package headfirst.designpatterns.stratergy;

/**
 * Created by dashsan on 3/12/2017.
 */
public class RubberDuck extends Duck {

    public RubberDuck(){
        super(new Squeak(), new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("Looks like Rubber Duck");
    }


}
