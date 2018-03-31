package san.doubt.fi;

import java.util.ArrayList;
import java.util.List;

public class FinalVar {
    final int[] a;

    public List<Integer> getB() {
        return b;
    }

    final List<Integer> b;

    public FinalVar() {
        a = new int[2];
        a[1] = 3;
        b = new ArrayList<>(2);
        b.add(20);
        try {
            if (true) {

                throw new Exception("Some message");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("DONE");
    }

    public void add(int val){
        b.add(val);
    }

    public static void main(String[] args) throws Exception {
        FinalVar f = new FinalVar();
        f.add(30);
        f.add(50);
        System.out.println(f.getB());

    }
}
