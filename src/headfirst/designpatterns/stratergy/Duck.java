package headfirst.designpatterns.stratergy;

/**
 * Created by dashsan on 3/12/2017.
 */
public abstract class Duck implements FlyBehavior, QuackBehavior{

    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }



    protected Duck(QuackBehavior qck, FlyBehavior fly){
        this.quackBehavior = qck;
        this.flyBehavior = fly;
    }


    @Override
    public void fly() {
        flyBehavior.fly();
    }

    @Override
    public void quack() {
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("Swimming...");
    }


    public abstract void display();
}
