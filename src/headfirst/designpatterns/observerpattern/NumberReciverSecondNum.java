package headfirst.designpatterns.observerpattern;

/**
 * Created by dashsan on 3/13/2017.
 */
public class NumberReciverSecondNum implements Observer {

    Subject numberFire;

    public NumberReciverSecondNum(Subject numberFire) {
        this.numberFire = numberFire;
        numberFire.register(this);
    }

    @Override
    public void update(int anInt, int tInt) {
        System.out.println("Second Number:" + tInt);
        System.out.println("Unregistering for future updates");
        numberFire.unregister(this);
    }
}
