package headfirst.designpatterns.CommandPattern;

/**
 * Created by dashsan on 3/18/2017.
 */
public class Fan {

    private String location;
    private static final int OFF = 0;
    private static final int LOW = 1;
    private static final int MEDIUM = 2;
    private static final int HIGH = 3;

    private int speed;

    public Fan(String location) {
        this.location = location;
        speed = OFF;
    }

    public String getLocation() {
        return location;
    }

    public void high(){
        speed = HIGH;
        System.out.println(location + " Fan running on highest speed");
    }

    public void medium(){
        speed = MEDIUM;
        System.out.println(location + " Fan running on medium speed");
    }

    public void low(){
        speed = LOW;
        System.out.println(location + " Fan running on low speed");
    }

    public void off(){
        speed = OFF;
        System.out.println(location + " Fan is switched off");
    }

    public int getSpeed(){
        return speed;
    }

}


