package headfirst.designpatterns.SingleTon;

/**
 * Created by dashsan on 3/18/2017.
 */
public class TestGasStove {

    public static void main(String[] args) {

        SingleGasStove milu = SingleGasStove.getInstance();
        SingleGasStove pinki = SingleGasStove.getInstance();

        milu.removeItemFromStove();
        milu.putItemOnStove("Milk");
        pinki.putItemOnStove("Chicken");
        pinki.removeItemFromStove();
        pinki.putItemOnStove("Chicken");
        milu.putItemOnStove("Milk");
        pinki.removeItemFromStove();
        milu.removeItemFromStove();

    }
}
