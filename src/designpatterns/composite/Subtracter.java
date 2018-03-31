package designpatterns.composite;

public class Subtracter extends ArithMetric {
    public Subtracter(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int getValue() {
        return this.left.getValue() - this.right.getValue();
    }
}
