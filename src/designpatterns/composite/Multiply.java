package designpatterns.composite;

public class Multiply extends ArithMetric {
    public Multiply(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int getValue() {
        return this.left.getValue() * this.right.getValue();
    }
}
