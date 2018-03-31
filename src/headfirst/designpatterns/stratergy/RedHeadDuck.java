package headfirst.designpatterns.stratergy;

/**
 * Created by dashsan on 3/12/2017.
 */
public class RedHeadDuck extends Duck {


    public RedHeadDuck(){
        super(new Quack(), new FlyWithWings());
    }

    @Override
    public void display() {
        System.out.println("Looks Like Red Head Duck");
    }

}
