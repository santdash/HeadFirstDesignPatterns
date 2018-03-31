package headfirst.designpatterns.CommandPattern;

/**
 * Created by dashsan on 3/18/2017.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        // Slot 1
        Light livingRoomLight = new Light("Living Room");
        // Program the remote control slot 1 (index 0) for Living room light
        remoteControl.setCommand(0, new LightOnCommand(livingRoomLight), new LightOffCommand(livingRoomLight));

        // Program remote control for fan in Drawing room
        Fan drawingRoomFan = new Fan("Drawing room");
        remoteControl.setCommand(1, new FanHighCommand(drawingRoomFan), new FanOffCommand(drawingRoomFan));

        // Program remote to control Light in Kitchen.
        Light kitchenLight = new Light("Kitchen");
        remoteControl.setCommand(5, new LightOnCommand(kitchenLight), new LightOffCommand(kitchenLight));


        System.out.println(remoteControl.toString());

        remoteControl.pressOnButton(0);
        remoteControl.pressOffButton(0);
        remoteControl.pressUndoButton();
        remoteControl.pressOnButton(1);
        remoteControl.pressOnButton(1);
        remoteControl.pressOnButton(1);
        remoteControl.pressOnButton(1);
        remoteControl.pressUndoButton();
        remoteControl.pressUndoButton();
        remoteControl.pressOnButton(1);
        remoteControl.pressOffButton(1);
        remoteControl.pressOnButton(1);

        remoteControl.pressOnButton(5);
        remoteControl.pressOffButton(5);
        remoteControl.pressOffButton(1);
        remoteControl.pressUndoButton();

        remoteControl.pressOffButton(4);


    }
}
