package headfirst.designpatterns.CommandPattern;

/**
 * Created by dashsan on 3/18/2017.
 */
public class FanHighCommand extends FanSpecificCommand {

    private Fan fan;

    public FanHighCommand(Fan fan) {
        super(fan);
        this.fan = fan;
    }

    @Override
    public void execute() {
        setSpeed(fan.getSpeed() + 1);
    }

}
