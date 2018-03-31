package headfirst.designpatterns.observerpattern;

/**
 * Created by dashsan on 3/13/2017.
 */
public interface Subject {
    void register(Observer observer);
    void unregister(Observer observer);
}
