package headfirst.designpatterns.StatePattern;

/**
 * Created by dashsan on 5/11/2017.
 */
public class GumbarMachineTest {
    public static void main(String[] args) {
        GumbarMachine gumbarMachine = new GumbarMachine(3);
        gumbarMachine.ejectQuarter();
        gumbarMachine.insertQuarter();
        gumbarMachine.ejectQuarter();
        gumbarMachine.turnCrank();
        gumbarMachine.insertQuarter();
        gumbarMachine.turnCrank();
        gumbarMachine.insertQuarter();
        gumbarMachine.turnCrank();
        gumbarMachine.insertQuarter();
        gumbarMachine.turnCrank();
        gumbarMachine.insertQuarter();
        gumbarMachine.turnCrank();
        gumbarMachine.turnCrank();
        gumbarMachine.insertQuarter();
        gumbarMachine.turnCrank();
        gumbarMachine.refill(2);
        gumbarMachine.insertQuarter();
        gumbarMachine.turnCrank();
        gumbarMachine.insertQuarter();
        gumbarMachine.turnCrank();
        gumbarMachine.insertQuarter();
        gumbarMachine.turnCrank();
        gumbarMachine.insertQuarter();
        gumbarMachine.ejectQuarter();
        gumbarMachine.turnCrank();


    }
}
