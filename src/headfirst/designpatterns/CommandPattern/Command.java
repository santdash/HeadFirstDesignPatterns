package headfirst.designpatterns.CommandPattern;

/**
 * Created by dashsan on 3/18/2017.
 */
public interface Command {
    void execute();
    void undo();
    String getLocation();
}

