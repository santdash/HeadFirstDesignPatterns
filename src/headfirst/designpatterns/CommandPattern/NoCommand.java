package headfirst.designpatterns.CommandPattern;

/**
 * Created by dashsan on 3/19/2017.
 */
public class NoCommand implements Command {

    private static NoCommand instance;

    private NoCommand(){}

    public static NoCommand getInstance(){
        if ( instance == null ){
            synchronized (NoCommand.class){
                if (instance == null){
                    instance = new NoCommand();
                }
            }
        }
        return instance;
    }

    @Override
    public void execute() {
        System.out.println("Slot is empty");
    }

    @Override
    public void undo() {
        System.out.println("Slot is empty");
    }

    @Override
    public String getLocation() {
        return null;
    }
}
