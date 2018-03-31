package headfirst.designpatterns.CommandPattern;

/**
 * Created by dashsan on 3/19/2017.
 */
public abstract class FanSpecificCommand implements Command{

    private Fan fan;

    public int getPrevSpeed() {
        return prevSpeed;
    }

    private int prevSpeed;

    public FanSpecificCommand(Fan fan) {
        this.fan = fan;
        prevSpeed = fan.getSpeed();
    }

    @Override
    public void undo() {
        setSpeed(getPrevSpeed());
    }

    @Override
    public String getLocation() {
        return fan.getLocation();
    }

    public void setSpeed(int speed) {
        switch(speed) {
            case 0:
                prevSpeed = fan.getSpeed();
                fan.off();
                break;
            case 1:
                prevSpeed = fan.getSpeed();
                fan.low();
                break;
            case 2:
                prevSpeed = fan.getSpeed();
                fan.medium();
                break;
            case 3:
                prevSpeed = fan.getSpeed();
                fan.high();
                break;
            default:
                System.out.println("WARN: Invalid speed to set, no change to fan");
                break;
        }
    }
}
