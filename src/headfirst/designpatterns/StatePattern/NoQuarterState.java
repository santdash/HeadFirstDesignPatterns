package headfirst.designpatterns.StatePattern;

/**
 * Created by dashsan on 5/9/2017.
 */
public class NoQuarterState implements State {

    private GumbarMachine gumbarMachine;

    public NoQuarterState(GumbarMachine gumbarMachine) {
        this.gumbarMachine = gumbarMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You have inserted a quarter");
        gumbarMachine.setState(gumbarMachine.getHasQuarterState());

    }

    @Override
    public void ejectQuarter() {
        System.out.println("ERROR: There is no quarter to eject");
    }

    @Override
    public void turnCrank() {
        System.out.println("Please insert a quarter first...");
    }

    @Override
    public void dispense() {
        System.out.println("Please insert a quarter and turn crank to get gum balls");
    }
}
