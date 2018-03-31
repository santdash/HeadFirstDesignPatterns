package designpatterns.composite;

public class Adder extends ArithMetric {

    public Adder(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int getValue() {
        return this.left.getValue() + this.right.getValue();
    }
}
