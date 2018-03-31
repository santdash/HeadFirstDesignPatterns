package san.doubt.abstractc;

/**
 * Created by dashsan on 3/27/2017.
 */
public abstract class BaseAbstractClass {

    public abstract void getDef();

    public void doSomething(){
        System.out.println("Doing something in BaseAbstractClass");
        getDef();
    }
}
