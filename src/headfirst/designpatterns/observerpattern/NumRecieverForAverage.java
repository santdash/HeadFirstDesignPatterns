package headfirst.designpatterns.observerpattern;

/**
 * Created by dashsan on 3/13/2017.
 */
public class NumRecieverForAverage implements Observer {

    Subject numberFire;

    public NumRecieverForAverage(Subject numberFire) {
        this.numberFire = numberFire;
        numberFire.register(this);
    }

    @Override
    public void update(int anInt, int tInt) {
        System.out.println("NumRecieverForAverage: Avg:" + (anInt + tInt)/2);
    }
}
