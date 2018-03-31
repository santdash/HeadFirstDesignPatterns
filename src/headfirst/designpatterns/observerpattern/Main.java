package headfirst.designpatterns.observerpattern;

/**
 * Created by dashsan on 3/13/2017.
 */
public class Main {

    public static void main(String[] args) {
        NumberFire numberFire = new NumberFire();
        NumRecieverForAverage numRecieverForAverage = new NumRecieverForAverage(numberFire);
        NumberReciverSecondNum numberReciverSecondNum = new NumberReciverSecondNum(numberFire);
        NumberReceiverMax numberReceiverMax = new NumberReceiverMax(numberFire);

        numberFire.sendNumbers(1, 7);
        numberFire.sendNumbers(4,9);
        numberFire.sendNumbers(36,18);
    }
}
