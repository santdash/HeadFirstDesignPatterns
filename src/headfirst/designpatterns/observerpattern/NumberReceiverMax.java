package headfirst.designpatterns.observerpattern;

/**
 * Created by dashsan on 3/14/2017.
 */
public class NumberReceiverMax implements Observer {

    Subject subject;

    public NumberReceiverMax(Subject subject) {
        this.subject = subject;
        subject.register(this);
    }


    @Override
    public void update(int anInt, int tInt) {
        int max;
        if ( anInt > tInt){
            max = anInt;
        }
        else
        {
            max = tInt;
        }
        System.out.println("Max of the two numbers received is: " + max);

    }
}
