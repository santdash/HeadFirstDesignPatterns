package designpatterns.composite;

public class Devide extends ArithMetric {
    public Devide(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int getValue() {
        return this.left.getValue() / this.right.getValue();
    }
}
