package headfirst.designpatterns.StatePattern;

/**
 * Created by dashsan on 5/9/2017.
 */
public class HasQuarterState implements State {
    private GumbarMachine gumbarMachine;
    public HasQuarterState(GumbarMachine gumbarMachine) {
        this.gumbarMachine = gumbarMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("ERROR: Already has a quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Ejecting quarter");
        gumbarMachine.setState(gumbarMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("Crank turned");
        gumbarMachine.setState(gumbarMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("You need to turn crank to dispense gumbars");
    }
}
