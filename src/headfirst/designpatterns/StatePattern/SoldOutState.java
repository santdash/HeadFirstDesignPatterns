package headfirst.designpatterns.StatePattern;

/**
 * Created by dashsan on 5/9/2017.
 */
public class SoldOutState implements State {

    private GumbarMachine gumBarMachine;

    public SoldOutState(GumbarMachine gumbarMachine) {
    }

    @Override
    public void insertQuarter() {
        System.out.println("ERROR: We are sold out, can't insert quarter");

    }

    @Override
    public void ejectQuarter() {
        System.out.println("ERROR: We are sold out, no quarter can be inserted or ejected");
    }

    @Override
    public void turnCrank() {
        System.out.println("ERROR: We are sold out, can't turn crank.. You must have got your quarter back");
    }

    @Override
    public void dispense() {
        System.out.println("ERROR: Can't dispense gumbars");
    }
}
