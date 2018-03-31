package sant.utility;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by dashsan on 4/15/2017.
 */
public class UtilityMethods {

    public static synchronized void printCallStack(){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
/*        for (int i = 0; i < stackTraceElements.length ; i++) {
            System.out.println("Class: " + stackTraceElements[i].getClassName()+" Method: "+ stackTraceElements[i].getMethodName());
        }*/
        System.out.println(Arrays.toString(Arrays.copyOfRange(stackTraceElements, 0, 20)));
    }
}
