package headfirst.designpatterns.stratergy;

/**
 * Created by dashsan on 3/12/2017.
 */
public class Main {

    public static void main(String[] args) {
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        MallardDuck mallardDuck = new MallardDuck();
        RubberDuck rubberDuck = new RubberDuck();
        display(redHeadDuck);
        display(mallardDuck);
        display(rubberDuck);
        Duck duck = new ModelDuck();
        display(duck);
        duck.setFlyBehavior(new FlyRocketPowered());
        display(duck);

        //Mimic Duck call
        MimicDuckCall mimicDuckCall = new MimicDuckCall();
        mimicDuckCall.quack();
    }

    private static void display(Duck duck){
       duck.display();
       duck.quack();
       duck.swim();
       duck.fly();
    }
}
