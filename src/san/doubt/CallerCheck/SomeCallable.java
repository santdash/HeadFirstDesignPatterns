package san.doubt.CallerCheck;

import sant.utility.UtilityMethods;

/**
 * Created by dashsan on 4/15/2017.
 */
public class SomeCallable implements Runnable {
    private SomeCaller someCaller;

   public SomeCallable(){
       someCaller = new SomeCaller("Demo test");
       UtilityMethods.printCallStack();
   }

   public void printText(){
       someCaller.getTxt();
   }

    @Override
    public void run() {
        System.out.println("Hi");
        UtilityMethods.printCallStack();
    }
}
