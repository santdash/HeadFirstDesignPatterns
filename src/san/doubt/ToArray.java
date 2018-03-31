package san.doubt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArray {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hi");
        stringList.add("Hello");
        stringList.add("Bye");

        final String[] NULL_STRING_ARRAY = new String[0];
        String[] c = stringList.toArray(NULL_STRING_ARRAY);
        System.out.println(Arrays.toString(c));


    }
}
