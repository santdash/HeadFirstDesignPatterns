package san.doubt.CallerCheck;

/**
 * Created by dashsan on 4/15/2017.
 */
public class CallerMain {

    public static void main(String[] args) {
        SomeCallable callable = new SomeCallable();
        Thread th = new Thread(callable);
        th.start();
        System.out.println(CallerMain.class.getName());
        //callable.printText();
    }
}
