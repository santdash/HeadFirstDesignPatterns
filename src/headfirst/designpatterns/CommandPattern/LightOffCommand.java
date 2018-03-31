package headfirst.designpatterns.CommandPattern;

/**
 * Created by dashsan on 3/18/2017.
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }

    @Override
    public String getLocation() {
        return light.getRoomName();
    }
}
