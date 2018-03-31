package headfirst.designpatterns.StatePattern;

/**
 * Created by dashsan on 5/9/2017.
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
