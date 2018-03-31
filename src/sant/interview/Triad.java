package sant.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triad {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        //System.out.println(list);
        printTriad(list);
    }

    public static void printTriad(List<Integer> list){
        for ( int i = 0; i < list.size(); i++ ){
            if ( list.get(i) > 13)
                continue;
            for ( int j = i + 1; j < list.size(); j++ ){
                if ( list.get(i) + list.get(j) > 13)
                    continue;
                for ( int k = j + 1; k < list.size(); k++ ){
                    if ( list.get(i) + list.get(j) + list.get(k) > 13)
                        continue;
                    System.out.println(list.get(i) + " " + list.get(j) + " " + list.get(k));
                }
            }

        }
    }

}
