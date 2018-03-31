package headfirst.designpatterns.StatePattern;

/**
 * Created by dashsan on 5/9/2017.
 */
public class GumbarMachine {



    private int numberOfGumBars;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State soldOutState;

    private State state;

    public GumbarMachine(int numberOfGumBars) {
        this.numberOfGumBars = numberOfGumBars;
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldOutState = new SoldOutState(this);
        this.soldState = new Sold(this);
        if (numberOfGumBars > 0) {
            this.state = noQuarterState;
        }
    }

    public void setNumberOfGumBars(int numberOfGumBars) {
        this.numberOfGumBars = numberOfGumBars;
    }

    public int getNumberOfGumBars() {
        return numberOfGumBars;
    }

    public void refill(int numberOfGumBars) {
        this.numberOfGumBars += numberOfGumBars;
        if (state.equals(soldOutState)) {
            setState(getNoQuarterState());
        }
    }


    public void setState(State state) {
        this.state = state;
    }


    public State getNoQuarterState() {
        return noQuarterState;
    }


    public State getHasQuarterState() {
        return hasQuarterState;
    }


    public State getSoldOutState() {
        return soldOutState;
    }


    public State getSoldState() {
        return soldState;
    }

    public void insertQuarter() {
        state.insertQuarter();
        if ( numberOfGumBars <= 0 ){
            setState(getSoldOutState());
        }
    }

    public void ejectQuarter() {
        this.state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    private void dispense() {
        this.state.dispense();
        if ( numberOfGumBars == 0 ){
            setState(getSoldOutState());
        }
    }
}
