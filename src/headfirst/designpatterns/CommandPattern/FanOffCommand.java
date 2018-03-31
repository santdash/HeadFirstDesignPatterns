package headfirst.designpatterns.CommandPattern;

/**
 * Created by dashsan on 3/18/2017.
 */
public class FanOffCommand extends FanSpecificCommand{

    private Fan fan;

    public FanOffCommand(Fan fan) {
        super(fan);
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.off();
    }


}
