package headfirst.designpatterns.CommandPattern;

import java.util.List;

/**
 * Created by dashsan on 3/19/2017.
 */
public class TV {
    private List<String> channels;
    private int currentChannel;
    private int volume;

    public void switchOn(){
        System.out.println("TV is switched on");
    }

    public void swithOff(){
        System.out.println("Switching off TV");
    }

    public void increaseVolume(){
        volume++;
    }

    public void decreaseVolume(){
        volume--;
    }

    public void nextChannel(){
        if ( currentChannel <= 5 ){
            currentChannel++;
        }
        else
            currentChannel = 1;
    }

    public void previousChannel(){
        if ( currentChannel > 1){
            currentChannel--;
        }
        else
            currentChannel = 5;
    }
}
