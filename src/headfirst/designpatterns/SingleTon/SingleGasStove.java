package headfirst.designpatterns.SingleTon;

/**
 * Created by dashsan on 3/18/2017.
 */
public class SingleGasStove {


    private static SingleGasStove singleGasStove;

    private boolean isStoveFree = true;
    private String item;

    private SingleGasStove() {
        // Don't instantiate this.
    }


    public synchronized static SingleGasStove getInstance() {
        if (singleGasStove == null){
            singleGasStove = new SingleGasStove();
        }
        return singleGasStove;
    }


    public void removeItemFromStove(){
        if ( isStoveFree ){
            System.out.println("Stove is already free for use");
            return;
        }
        System.out.println("Removing " + item + " from stove");
        item = null;
        isStoveFree = true;
    }

    public synchronized void putItemOnStove(String item){
        if ( ! isStoveFree ){
            System.out.println("Cann't put "+ item + " is on stove, already "+ this.item + " is on stove");
        }
        else
        {
            System.out.println("Putting " + item + " on stove");
            this.item = item;
            isStoveFree = false;
        }
    }
}
