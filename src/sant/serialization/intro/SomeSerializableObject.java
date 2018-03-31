package sant.serialization.intro;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SomeSerializableObject implements Serializable {
    private int a;
    private int b;
    private transient int c;
    private final transient List<Integer> fInt = new ArrayList<>();
    private transient static int someVal = 10;
    private transient final int d;

    public int getD() {
        return d;
    }



    public int getSomeVal() {
        return someVal;
    }

    public SomeSerializableObject(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = 500;
        fInt.add(100);
        someVal++;
    }
    public void addToList(int val){
        fInt.add(val);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public List<Integer> getfInt() {
        return fInt;
    }
}
