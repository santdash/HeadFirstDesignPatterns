package san.doubt.CallerCheck;

import sant.utility.UtilityMethods;

/**
 * Created by dashsan on 4/15/2017.
 */
public class SomeCaller {
    private String txt;

    public SomeCaller(String test) {
        this.txt = test;
    }

    public String getTxt() {
        UtilityMethods.printCallStack();
        return txt;
    }



}
