package headfirst.designpatterns.observerpattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by dashsan on 3/13/2017.
 */
public class NumberFire implements Subject {
    List<Observer> observers = Collections.synchronizedList(new ArrayList<Observer>());
    private int anInt;
    private  int tInt;

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    /* Notify all subscribers */
    private void notifyObservers(List<Observer> obsrs){
        obsrs.forEach(observer -> observer.update(anInt, tInt));
    }
    /* Just a simulation to fire notifyObservers */

    public synchronized void sendNumbers(int anInt, int tInt) {
        this.anInt = anInt;
        this.tInt = tInt;
        List<Observer> copy = new ArrayList<>();
        observers.forEach(obs -> copy.add(obs));
        notifyObservers(copy);
    }

    public NumberFire(){

    }
}
