package designpatterns.composite;

public class Constant implements Expression {

    private final int i;

    public Constant(int i) {
        this.i = i;
    }

    @Override
    public int getValue() {
        return i;
    }
}
