package designpatterns.composite;

public abstract class ArithMetric implements Expression {
    protected Expression left;
    protected Expression right;

    public ArithMetric(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }
}
