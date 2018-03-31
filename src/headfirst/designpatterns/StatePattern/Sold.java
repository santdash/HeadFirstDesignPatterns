package headfirst.designpatterns.StatePattern;

/**
 * Created by dashsan on 5/9/2017.
 */
public class Sold implements State {

    private final GumbarMachine gumbarMachine;

    public Sold(GumbarMachine gumbarMachine) {
        this.gumbarMachine = gumbarMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("ERROR: Can't insert quarter now");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("ERROR: Crank truned, can't eject quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("ERROR: Can't turn crank twice");
    }

    @Override
    public void dispense() {
        System.out.println("Gmbar rolling out...");
        gumbarMachine.setNumberOfGumBars(gumbarMachine.getNumberOfGumBars() - 1);
    }
}
