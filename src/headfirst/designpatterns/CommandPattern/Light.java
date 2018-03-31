package headfirst.designpatterns.CommandPattern;

/**
 * Created by dashsan on 3/18/2017.
 */
public class Light {
    public String getRoomName() {
        return roomName;
    }

    private String roomName;

    public Light(String roomName) {
        this.roomName = roomName;
    }

    public void off(){
        System.out.println(roomName + " lights switched off");
    }

    public void on(){
        System.out.println(roomName + " lights switched on");
    }
}
