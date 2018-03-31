package headfirst.designpatterns.CommandPattern;

/**
 * Created by dashsan on 3/18/2017.
 */
public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = NoCommand.getInstance();
            offCommands[i] = NoCommand.getInstance();
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void pressOnButton(int slot) {
        System.out.println("Slot " + (slot + 1) + " On button pressed");
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void pressOffButton(int slot) {
        System.out.println("Slot " + ( slot + 1 ) + " Off button pressed");
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void pressUndoButton() {
        if (undoCommand != null) {
            System.out.println("Undoing the last action");
            undoCommand.undo();
        } else {
            System.out.println("Nothing to undo");
        }
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("\n---------------Remote Control---------------\n");
        for (int i = 0; i < onCommands.length; i++) {
            if (onCommands[i].getClass().getName().contains("NoCommand")) {
                buffer.append("Slot: " + (i + 1) + " NO CARDS found in this SLOT\n");
                continue;
            }
            buffer.append("Slot:" + (i + 1) + " " + onCommands[i].getClass().getName() + "\t" + offCommands[i].getClass().getName() + " for " + onCommands[i].getLocation() + "\n");
        }
        return buffer.toString();
    }
}
