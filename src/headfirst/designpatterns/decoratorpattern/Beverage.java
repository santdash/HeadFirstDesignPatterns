package headfirst.designpatterns.decoratorpattern;

/**
 * Created by dashsan on 3/14/2017.
 */

/** This can be a abstract class if default implementation is needed for some of the methods. For the example shared
 * in HeadFirst Java Design patterns, it does not look like we need an abstract class
 */
public interface Beverage {
    float getCost();
    String getDescription();
}
